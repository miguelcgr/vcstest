package com.example.vcstest.rest

import com.example.vcstest.dto.VcsDto
import com.example.vcstest.service.VcsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController  // capa controller
@RequestMapping("/vcs")
class VcsController @Autowired constructor(
        private val vcsService: VcsService
){

    @GetMapping()
    fun get() :VcsDto {
        return vcsService.get()

    }

    @PostMapping()
    fun post(@RequestBody vcsDto: VcsDto) :VcsDto {

         return vcsService.post(vcsDto)
    }

    @PutMapping()
    fun put(@RequestBody vcsDto: VcsDto): VcsDto {

        return vcsService.put(vcsDto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): VcsDto {
        return vcsService.delete(id)
    }
}
