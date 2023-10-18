package com.example.marsphotos.fake

import com.example.marsphotos.Data.NetworkMarsPhotosRepository
import junit.framework.TestCase.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    suspend fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList(){
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}