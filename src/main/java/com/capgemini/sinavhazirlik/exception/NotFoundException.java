package com.capgemini.sinavhazirlik.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason="No book with that id or title found")
public class NotFoundException extends RuntimeException{
}
