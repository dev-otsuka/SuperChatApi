package com.SuperChat.SuperChatApi;

import com.SuperChat.SuperChatApi.domain.Status;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Status check Api
 */
public class StatusController {

  private static final String RETURN_NORMAL_MESSAGE = "ok";

  @RequestMapping(value = "/status", method = RequestMethod.GET)
  public Status status() {
    return new Status(RETURN_NORMAL_MESSAGE);
  }
}
