package com.tomasbusfri.files.casinopark.model.dao.config

import com.tomasbusfri.files.casinopark.model.dao.implementations.DAOCasinoImpl

class DAOFactory {
    private val conn by lazy { ConnectionFactory().createConnection() }

    fun startDAO(): DAOCasinoImpl {
        return DAOCasinoImpl(conn)
    }
}