package com.example.roomsiswa.view.route

import com.example.roomsiswa.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}