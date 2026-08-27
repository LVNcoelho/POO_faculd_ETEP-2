# POO_faculd_ETEP-2
# Industrial ERP - Módulo de Planejamento e Controle de Produção (PCP)

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Module](https://img.shields.io/badge/Module-Production%20Planning-blue.svg)]()
[![Status](https://img.shields.io/badge/Status-Completed-green.svg)]()

## 📌 Visão Geral do Projeto

Módulo focado no cálculo e previsão de estoque de fábrica para auxílio nas tomadas de decisão da linha de produção. Esta rotina é responsável por consolidar a capacidade produtiva normal, o estoque inicial e a demanda prevista para estimar o volume de estoque final do ciclo mensal.

---

## 🎯 Objetivos da Task

- **Ajuste de Escopo e Memória:** Correção de acesso a atributos de classe em contexto estático (`static scope`), garantindo a execução performática de cálculos de PCP.
- **Previsão de Estoque:** Validação da fórmula matemática de balanço de estoque:  
  $$\text{Estoque Final} = (\text{Estoque Inicial} + \text{Produção Normal}) - \text{Previsão de Demanda}$$

---

## 📂 Arquitetura de Arquivos

```text
.
├── Producao.java      # Classe de serviço para cálculo de previsão de estoque
└── README.md          # Documentação técnica do módulo
