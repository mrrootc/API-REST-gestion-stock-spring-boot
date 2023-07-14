package com.abdoulaye.gestionstock.controller;

import com.abdoulaye.gestionstock.controller.api.ClientApi;
import com.abdoulaye.gestionstock.dto.ClientDto;
import com.abdoulaye.gestionstock.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController implements ClientApi {

  private final ClientService clientService;

  @Override
  public ClientDto save(ClientDto dto) {
    return clientService.save(dto);
  }

  @Override
  public ClientDto findById(Integer id) {
    return clientService.findById(id);
  }

  @Override
  public List<ClientDto> findAll() {
    return clientService.findAll();
  }

  @Override
  public void delete(Integer id) {
    clientService.delete(id);
  }
}
