package com.example.vcstest.service

import com.example.vcstest.dto.VcsDto
import org.springframework.stereotype.Service

@Service   // indica a Spring que esta es la capa de Service
interface VcsService {
    fun get(): VcsDto

    fun post(vcsDto: VcsDto): VcsDto

    fun put(vcsDto: VcsDto): VcsDto

    fun delete(id: String): VcsDto
}