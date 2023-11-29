-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28/11/2023 às 23:13
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projetebem`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `administrativo`
--

CREATE TABLE `administrativo` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `administrativo`
--

INSERT INTO `administrativo` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(3, 'Tarefa Administrativa 0', 'Descricao da tarefa administrativa 1', '2023-11-25', 'Administrativo', 'Maria Luiza', 1),
(4, 'Tarefa Administrativa 2', 'teste teste', '2023-11-26', 'Administrativo', 'Maria Eduarda', 1),
(10, 'Documentacao', 'Documentacao mensal', '2023-11-30', 'administrativo', 'Ana Clara', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `colaboradores`
--

CREATE TABLE `colaboradores` (
  `id` int(11) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(80) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `setor` varchar(50) NOT NULL,
  `created_at` date NOT NULL DEFAULT current_timestamp(),
  `update_at` date DEFAULT NULL,
  `deleted_at` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `colaboradores`
--

INSERT INTO `colaboradores` (`id`, `nome`, `email`, `senha`, `telefone`, `setor`, `created_at`, `update_at`, `deleted_at`) VALUES
(2, 'Maria Luiza', 'marialuiza@gmail.com', '0037cc05167c41cc160be852660a20a12ae83f295c6334158a50f9ae0fa09863', '12987654321', 'marketing', '2023-11-26', NULL, NULL),
(3, '1', '3', '6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b', '3', 'operacoes', '2023-11-26', NULL, NULL),
(4, 'Ana Clara Silva', 'anaclara@gmail.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '12 9 9126-7834', 'operacoes', '2023-11-27', NULL, NULL),
(5, 'Ana Banana', 'anabanana@gmail.com', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '12 9 9182-6344', 'marketing', '2023-11-28', NULL, NULL),
(6, 'Lucas Golc', 'lucasgonc@gmail.com', '8d23cf6c86e834a7aa6eded54c26ce2bb2e74903538c61bdd5d2197997ab2f72', '12 9 9123-4966', 'financeiro', '2023-11-28', NULL, NULL),
(7, 'Giulia Policarpo', 'giuliapolicarpo@gmail.com', 'b3a8e0e1f9ab1bfe3a36f231f676f78bb30a519d2b21e6c530c0eee8ebb4a5d0', '12 9 9123-4321', 'comercial', '2023-11-28', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `comercial`
--

CREATE TABLE `comercial` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `comercial`
--

INSERT INTO `comercial` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(1, 'Venda Comercial 1', 'Descrição da venda comercial 1', '2023-11-25', 'Vendas', 'Maria Luiza', 1),
(2, 'Venda Comercial 2', 'Descrição da venda comercial 2', '2023-11-26', 'Vendas', 'Maria Eduarda', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `compras`
--

INSERT INTO `compras` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(2, 'Compra 1', 'Descrição da compra 1', '2023-11-25', 'Compras', 'Maria Eduarda', 1),
(3, 'Compra 2', 'Descrição da compra 2', '2023-11-26', 'Compras', 'Maria Luiza', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `financeiro`
--

CREATE TABLE `financeiro` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `financeiro`
--

INSERT INTO `financeiro` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(2, 'Atividade Financeira 1', 'Descrição da atividade financeira 1', '2023-11-25', 'Financeiro', 'Maria Eduarda', 1),
(3, 'Atividade Financeira 2', 'Descrição da atividade financeira 2', '2023-11-26', 'Financeiro', 'Maria Luiza', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `marketing`
--

CREATE TABLE `marketing` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `marketing`
--

INSERT INTO `marketing` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(3, 'Campanha de Marketing 1', 'Descrição da campanha de marketing 1', '2023-11-25', 'Marketing', 'Maria Eduarda', 1),
(4, 'Campanha de Marketing 2', 'Descrição da campanha de marketing 2', '2023-11-26', 'Marketing', 'Maria Luiza', 0),
(9, 'Reuniao com os CEOs ', 'Reuniao para tratar dos assustos sobre ideias de marketing \npara esse final de ano ', '29-11-23', 'marketing', 'Lucas Ferreira e Luciane Almeida', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `operacoes`
--

CREATE TABLE `operacoes` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `operacoes`
--

INSERT INTO `operacoes` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(1, 'Operação 1', 'Descrição da operação 1', '2023-11-25', 'Operações', 'Maria Eduarda', 1),
(2, 'Operação 2', 'Descrição da operação 2', '2023-11-26', 'Operações', 'Maria Luiza', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `recursoshumanos`
--

CREATE TABLE `recursoshumanos` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(300) NOT NULL,
  `data` varchar(10) NOT NULL,
  `setor` varchar(20) NOT NULL,
  `colaboradores` varchar(200) NOT NULL,
  `completo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `recursoshumanos`
--

INSERT INTO `recursoshumanos` (`id`, `nome`, `descricao`, `data`, `setor`, `colaboradores`, `completo`) VALUES
(1, 'tarefa rh', 'descricao rh', '26/11/2023', 'recursos humanos', 'Maria Eduarda', 1),
(2, 'Entrevistas de emprego', 'Reuniao com 3 candidatos para a vaga de gestor', '30-11-23', 'recursos humanos', 'Claudia', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `administrativo`
--
ALTER TABLE `administrativo`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `colaboradores`
--
ALTER TABLE `colaboradores`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `comercial`
--
ALTER TABLE `comercial`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `financeiro`
--
ALTER TABLE `financeiro`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `marketing`
--
ALTER TABLE `marketing`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `operacoes`
--
ALTER TABLE `operacoes`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `recursoshumanos`
--
ALTER TABLE `recursoshumanos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `administrativo`
--
ALTER TABLE `administrativo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `colaboradores`
--
ALTER TABLE `colaboradores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `comercial`
--
ALTER TABLE `comercial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `compras`
--
ALTER TABLE `compras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `financeiro`
--
ALTER TABLE `financeiro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `marketing`
--
ALTER TABLE `marketing`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `operacoes`
--
ALTER TABLE `operacoes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `recursoshumanos`
--
ALTER TABLE `recursoshumanos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
