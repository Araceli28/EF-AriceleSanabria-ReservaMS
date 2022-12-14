package com.idat.ReservaMS.service;

import java.util.List;

import com.idat.ReservaMS.dto.ReservaDTO;

public interface ReservaService {
	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);
}
