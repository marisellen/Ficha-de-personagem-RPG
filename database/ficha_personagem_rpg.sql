-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10/06/2024 às 19:29
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ficha_personagem_rpg`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `alquimista`
--

CREATE TABLE `alquimista` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `archer`
--

CREATE TABLE `archer` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `artesao`
--

CREATE TABLE `artesao` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `bard`
--

CREATE TABLE `bard` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `barra_de_status`
--

CREATE TABLE `barra_de_status` (
  `pontos_vida` int(11) NOT NULL,
  `pontos_experiencia` int(11) NOT NULL,
  `pontos_magia` int(11) NOT NULL,
  `pontos_estamina` int(11) NOT NULL,
  `pontos_constituicao` int(11) NOT NULL,
  `pontos_habilidades` int(11) NOT NULL,
  `personagem_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `barra_de_status`
--

INSERT INTO `barra_de_status` (`pontos_vida`, `pontos_experiencia`, `pontos_magia`, `pontos_estamina`, `pontos_constituicao`, `pontos_habilidades`, `personagem_id`) VALUES
(100, 50, 30, 10, 5, 5, 18),
(50, 0, 30, 20, 0, 0, 19);

-- --------------------------------------------------------

--
-- Estrutura para tabela `classe`
--

CREATE TABLE `classe` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `classe`
--

INSERT INTO `classe` (`id`, `name`, `magicClass`) VALUES
(30, 'Paladino', 0),
(31, 'Bardo', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cleric`
--

CREATE TABLE `cleric` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `construtor`
--

CREATE TABLE `construtor` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `craft`
--

CREATE TABLE `craft` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `craft`
--

INSERT INTO `craft` (`id`, `name`) VALUES
(22, 'Artesão'),
(23, 'Explorador');

-- --------------------------------------------------------

--
-- Estrutura para tabela `dragonborn`
--

CREATE TABLE `dragonborn` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dragonborn`
--

INSERT INTO `dragonborn` (`race_id`, `name`, `deslocamento`, `visaoNoEscuro`) VALUES
(35, NULL, 6, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `druid`
--

CREATE TABLE `druid` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `dwarf`
--

CREATE TABLE `dwarf` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `elven`
--

CREATE TABLE `elven` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `explorador`
--

CREATE TABLE `explorador` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ferreiro`
--

CREATE TABLE `ferreiro` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `halfling`
--

CREATE TABLE `halfling` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `human`
--

CREATE TABLE `human` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `inventario`
--

CREATE TABLE `inventario` (
  `item_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `personagem_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `inventario`
--

INSERT INTO `inventario` (`item_id`, `name`, `quantidade`, `personagem_id`) VALUES
(1, 'poção de mana', 3, 18),
(2, 'poção de vida', 3, 18),
(3, 'adagas', 5, 18),
(10, 'violino', 2, 19),
(11, 'poção de cura', 6, 19),
(12, 'poção de mana', 6, 19);

-- --------------------------------------------------------

--
-- Estrutura para tabela `mage`
--

CREATE TABLE `mage` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `necromancer`
--

CREATE TABLE `necromancer` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ork`
--

CREATE TABLE `ork` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `padre`
--

CREATE TABLE `padre` (
  `craft_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `paladin`
--

CREATE TABLE `paladin` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `personagem`
--

CREATE TABLE `personagem` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `height` double NOT NULL,
  `clothes` text NOT NULL,
  `appearance` text NOT NULL,
  `idioms` varchar(100) NOT NULL,
  `alignment` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `personagem`
--

INSERT INTO `personagem` (`id`, `name`, `age`, `height`, `clothes`, `appearance`, `idioms`, `alignment`) VALUES
(18, 'lily', 120, 2, 'Armadura pesada adornada de amarrações de linho azul.', 'Dragonata alta de pele avermelhada e cabelos longos e pretos com chifres apontados para tráz.', 'Comum, língua dos dragões.', 'Neutro Verdadeiro'),
(19, 'Ann', 50, 1.8, 'Usa uma blusa branca de algodão com um colete de couro por cima e calças pretas com botas morrom.', 'Tem cabelos pretos e lisos comcorpo atletico.', 'Comum e lingua antiga.', 'Caótico Bom');

-- --------------------------------------------------------

--
-- Estrutura para tabela `race`
--

CREATE TABLE `race` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `race`
--

INSERT INTO `race` (`id`, `name`, `deslocamento`, `visaoNoEscuro`) VALUES
(35, 'Dragonborn', 6, 0),
(36, 'Tiefling', 5, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `rogue`
--

CREATE TABLE `rogue` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `tiefling`
--

CREATE TABLE `tiefling` (
  `race_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `deslocamento` int(100) DEFAULT NULL,
  `visaoNoEscuro` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tiefling`
--

INSERT INTO `tiefling` (`race_id`, `name`, `deslocamento`, `visaoNoEscuro`) VALUES
(36, NULL, 5, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `warrior`
--

CREATE TABLE `warrior` (
  `class_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `magicClass` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alquimista`
--
ALTER TABLE `alquimista`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `archer`
--
ALTER TABLE `archer`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `artesao`
--
ALTER TABLE `artesao`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `bard`
--
ALTER TABLE `bard`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `barra_de_status`
--
ALTER TABLE `barra_de_status`
  ADD PRIMARY KEY (`personagem_id`);

--
-- Índices de tabela `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `cleric`
--
ALTER TABLE `cleric`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `construtor`
--
ALTER TABLE `construtor`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `craft`
--
ALTER TABLE `craft`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `dragonborn`
--
ALTER TABLE `dragonborn`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `druid`
--
ALTER TABLE `druid`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `dwarf`
--
ALTER TABLE `dwarf`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `elven`
--
ALTER TABLE `elven`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `explorador`
--
ALTER TABLE `explorador`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `ferreiro`
--
ALTER TABLE `ferreiro`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `halfling`
--
ALTER TABLE `halfling`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `human`
--
ALTER TABLE `human`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `personagem_id` (`personagem_id`);

--
-- Índices de tabela `mage`
--
ALTER TABLE `mage`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `necromancer`
--
ALTER TABLE `necromancer`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `ork`
--
ALTER TABLE `ork`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `padre`
--
ALTER TABLE `padre`
  ADD PRIMARY KEY (`craft_id`);

--
-- Índices de tabela `paladin`
--
ALTER TABLE `paladin`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `personagem`
--
ALTER TABLE `personagem`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `race`
--
ALTER TABLE `race`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `rogue`
--
ALTER TABLE `rogue`
  ADD PRIMARY KEY (`class_id`);

--
-- Índices de tabela `tiefling`
--
ALTER TABLE `tiefling`
  ADD PRIMARY KEY (`race_id`);

--
-- Índices de tabela `warrior`
--
ALTER TABLE `warrior`
  ADD PRIMARY KEY (`class_id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alquimista`
--
ALTER TABLE `alquimista`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `archer`
--
ALTER TABLE `archer`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `artesao`
--
ALTER TABLE `artesao`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `bard`
--
ALTER TABLE `bard`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `barra_de_status`
--
ALTER TABLE `barra_de_status`
  MODIFY `personagem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `classe`
--
ALTER TABLE `classe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de tabela `cleric`
--
ALTER TABLE `cleric`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `construtor`
--
ALTER TABLE `construtor`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `craft`
--
ALTER TABLE `craft`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `dragonborn`
--
ALTER TABLE `dragonborn`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de tabela `druid`
--
ALTER TABLE `druid`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `dwarf`
--
ALTER TABLE `dwarf`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `elven`
--
ALTER TABLE `elven`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `explorador`
--
ALTER TABLE `explorador`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `ferreiro`
--
ALTER TABLE `ferreiro`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `halfling`
--
ALTER TABLE `halfling`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `human`
--
ALTER TABLE `human`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `inventario`
--
ALTER TABLE `inventario`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `mage`
--
ALTER TABLE `mage`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `necromancer`
--
ALTER TABLE `necromancer`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `ork`
--
ALTER TABLE `ork`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `padre`
--
ALTER TABLE `padre`
  MODIFY `craft_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `paladin`
--
ALTER TABLE `paladin`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `personagem`
--
ALTER TABLE `personagem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `race`
--
ALTER TABLE `race`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `rogue`
--
ALTER TABLE `rogue`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tiefling`
--
ALTER TABLE `tiefling`
  MODIFY `race_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `warrior`
--
ALTER TABLE `warrior`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `alquimista`
--
ALTER TABLE `alquimista`
  ADD CONSTRAINT `alquimista_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `archer`
--
ALTER TABLE `archer`
  ADD CONSTRAINT `archer_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `artesao`
--
ALTER TABLE `artesao`
  ADD CONSTRAINT `artesao_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `bard`
--
ALTER TABLE `bard`
  ADD CONSTRAINT `bard_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `barra_de_status`
--
ALTER TABLE `barra_de_status`
  ADD CONSTRAINT `barra_de_status_ibfk_1` FOREIGN KEY (`personagem_id`) REFERENCES `personagem` (`id`),
  ADD CONSTRAINT `fk_personagem_id` FOREIGN KEY (`personagem_id`) REFERENCES `personagem` (`id`);

--
-- Restrições para tabelas `cleric`
--
ALTER TABLE `cleric`
  ADD CONSTRAINT `cleric_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `construtor`
--
ALTER TABLE `construtor`
  ADD CONSTRAINT `construtor_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `dragonborn`
--
ALTER TABLE `dragonborn`
  ADD CONSTRAINT `dragonborn_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `druid`
--
ALTER TABLE `druid`
  ADD CONSTRAINT `druid_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `dwarf`
--
ALTER TABLE `dwarf`
  ADD CONSTRAINT `dwarf_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `elven`
--
ALTER TABLE `elven`
  ADD CONSTRAINT `elven_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `explorador`
--
ALTER TABLE `explorador`
  ADD CONSTRAINT `explorador_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `ferreiro`
--
ALTER TABLE `ferreiro`
  ADD CONSTRAINT `ferreiro_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `halfling`
--
ALTER TABLE `halfling`
  ADD CONSTRAINT `halfling_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `human`
--
ALTER TABLE `human`
  ADD CONSTRAINT `human_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`personagem_id`) REFERENCES `personagem` (`id`);

--
-- Restrições para tabelas `mage`
--
ALTER TABLE `mage`
  ADD CONSTRAINT `mage_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `necromancer`
--
ALTER TABLE `necromancer`
  ADD CONSTRAINT `necromancer_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `ork`
--
ALTER TABLE `ork`
  ADD CONSTRAINT `ork_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `padre`
--
ALTER TABLE `padre`
  ADD CONSTRAINT `padre_ibfk_1` FOREIGN KEY (`craft_id`) REFERENCES `craft` (`id`);

--
-- Restrições para tabelas `paladin`
--
ALTER TABLE `paladin`
  ADD CONSTRAINT `paladin_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `rogue`
--
ALTER TABLE `rogue`
  ADD CONSTRAINT `rogue_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);

--
-- Restrições para tabelas `tiefling`
--
ALTER TABLE `tiefling`
  ADD CONSTRAINT `tiefling_ibfk_1` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Restrições para tabelas `warrior`
--
ALTER TABLE `warrior`
  ADD CONSTRAINT `warrior_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classe` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
