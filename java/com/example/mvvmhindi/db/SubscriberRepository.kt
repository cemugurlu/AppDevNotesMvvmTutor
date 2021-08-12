package com.example.mvvmhindi.db

/**
 * Repository for the MVVM arch
 */
class SubscriberRepository(private val dao: SubscriberDao) {

    val subscribers = dao.getAllSubscribers()  // our func that implies the query operations

    suspend fun insert(subscriber: Subscriber) {
        dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber) {
        dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber) {
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll() {
        dao.deleteAll()
    }
}