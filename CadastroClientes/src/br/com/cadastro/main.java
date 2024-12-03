package br.com.cadastro;


import java.util.ArrayList;

import java.util.Scanner;


public class Main {

    private static ArrayList<Cliente> clientes = new ArrayList<>();


    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("1. Adicionar Cliente");

            System.out.println("2. Listar Clientes");

            System.out.println("3. Remover Cliente");

            System.out.println("4. Adicionar Veículo a Cliente");

            System.out.println("5. Agendar Vistoria");

            System.out.println("6. Listar Agendamentos de Cliente");

            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {

                case 1:

                    adicionarCliente(scanner);

                    break;

                case 2:

                    listarClientes();

                    break;

                case 3:

                    removerCliente(scanner);

                    break;

                case 4:

                    adicionarVeiculoACliente(scanner);

                    break;

                case 5:

                    agendarVistoria(scanner);

                    break;

                case 6:

                    ListarAgendamentosDeCliente(scanner);

                    break;

                case 7:

                    System.out.println("Saindo...");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        }

        

        scanner.close();

    }


    private static void adicionarCliente(Scanner scanner) {

    	    System.out.print("Nome: ");

    	    String nome = scanner.nextLine();

    	    System.out.print("Email: ");

    	    String email = scanner.nextLine();

    	    System.out.print("Telefone: ");

    	    String telefone = scanner.nextLine();


    	    Cliente cliente = new Cliente(nome, email, telefone);

    	    clientes.add(cliente);

    	    System.out.println("Cliente adicionado com sucesso!");

    	}


    private static void listarClientes() {

    }


    private static void removerCliente(Scanner scanner) {

    }


    private static void adicionarVeiculoACliente(Scanner scanner) {

    	System.out.print("Digite o nome do cliente: ");

        String nomeCliente = scanner.nextLine();


        Cliente cliente = null;

        for (Cliente c : clientes) {

            if (c.getNome().equalsIgnoreCase(nomeCliente)) {

                cliente = c;

                break;

            }

        }


        if (cliente != null) {

            System.out.print("Marca do veículo: ");

            String marca = scanner.nextLine();

            System.out.print("Modelo do veículo: ");

            String modelo = scanner.nextLine();

            System.out.print("Placa do veículo: ");

            String placa = scanner.nextLine();


            Veiculo veiculo = new Veiculo(marca, modelo, placa);

            cliente.adicionarVeiculo(veiculo);

            System.out.println("Veículo adicionado com sucesso!");

        } else {

            System.out.println("Cliente não encontrado.");

        }

    }

    	

    }


    private static void agendarVistoria(Scanner scanner) {

    }


    private static void listarAgendamentosDeCliente(Scanner scanner) {

    }

}
......................................................................0.................
