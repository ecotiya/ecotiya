package com.app.ecotiya.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

  /** ���C���y�[�W��\�����邽�߂ɕK�v�ȃf�[�^���擾���܂��B */
  @GetMapping("/")
  public String mainApp() {
    return "mainApp";
  }

  /** ���₢���킹�y�[�W��\�����邽�߂ɕK�v�ȃf�[�^���擾���܂��B */
  @GetMapping("/contact")
  public String contact() {
    return "contact";
  }

  /** ���₢���킹�y�[�W�̓��e���f�[�^�x�[�X�ɕۑ��y�сA���[�����M���s���܂��B */
  @GetMapping("/contact/post")
  public String postContact() {
    return "postContact";
  }

  // TODO
  @GetMapping("/hello")
  public String hello() {
    return "Hello World.";
  }
}
