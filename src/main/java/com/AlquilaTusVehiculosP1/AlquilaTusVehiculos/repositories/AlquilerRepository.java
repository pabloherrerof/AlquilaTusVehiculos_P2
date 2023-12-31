package com.AlquilaTusVehiculosP1.AlquilaTusVehiculos.repositories;

import com.AlquilaTusVehiculosP1.AlquilaTusVehiculos.models.Alquiler;
import com.AlquilaTusVehiculosP1.AlquilaTusVehiculos.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AlquilerRepository extends MongoRepository<Alquiler, String> {
    List<Alquiler> findByClienteId(String clienteId);
}
