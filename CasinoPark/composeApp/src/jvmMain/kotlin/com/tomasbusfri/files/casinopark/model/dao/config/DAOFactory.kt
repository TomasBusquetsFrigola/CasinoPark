package com.tomasbusfri.files.casinopark.model.dao.config

class DAOFactory {
    private val conn by lazy { ConnectionFactory().createConnection() }

//    fun startDAO(): DAODeckImpl {
//        return DAODeckImpl(conn)
//    }
}