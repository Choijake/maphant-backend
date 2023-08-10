package com.tovelop.maphant.dto

import java.time.LocalDateTime

data class UserReportDTO(
    val id: Int? = null,
    val userId: Int,
    val deadlineAt: LocalDateTime = LocalDateTime.now(),
    val sanctionReason: String
)
