package com.example.vcstest.service.implementation

import com.example.vcstest.dto.VcsDto
import com.example.vcstest.service.VcsService
import org.springframework.stereotype.Service

@Service
class VcsServiceImpl : VcsService {
    override fun get(): VcsDto {
     return  VcsDto("identif", "nombre")
    }

    override fun post(vcsDto: VcsDto): VcsDto{
      vcsDto.id = "3456789"
        return vcsDto
    }

    override fun put(vcsDto: VcsDto): VcsDto{
        vcsDto.name = "juan"
        return vcsDto
    }

    override fun delete(id: String): VcsDto{
           return VcsDto("idid", "namename")
    }
}