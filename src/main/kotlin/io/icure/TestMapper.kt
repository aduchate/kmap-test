package io.icure

import io.icure.kmap.Mapper

@Mapper
interface TestMapper {
    fun map(a: A): B
}
