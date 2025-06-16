create database SalasReuniao;

use SalasReuniao;

CREATE TABLE tb_salasreuniao (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    capacidade INT NOT NULL,
    localizacao VARCHAR(150) NOT NULL,
    possuiProjetor BOOLEAN NOT NULL,
    possuiArCondicionado BOOLEAN NOT NULL,
    numeroCadeiras INT NOT NULL,
    tipoMesa VARCHAR(50) NOT NULL,
    recursosAdicionais VARCHAR(255)
);
