package prog2.aula06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) 
	{
		/* 1 - CONEXÃO COM O BANCO */
		
		// Informações para conexão com o banco
		String conexao = "jdbc:postgresql://localhost:5432/postgres"; //banco padrão
		String usuario = "postgres";
		String senha = "admin12345";
		
		try 
		{
			// Carregando o Driver
			Class.forName("org.postgresql.Driver");
			
			// Criando a conexão
			Connection conn = DriverManager.getConnection(conexao, usuario, senha);
			
		/* 2 - COMANDOS PARA O BANCO */
			// Statement para lidar com os comandos
			Statement stmt = conn.createStatement();
			
			// SQL para criar uma tabela
			/*----------------------------------------------------------------
			   String createTableSQL = "CREATE TABLE Pessoa("
					+ "cpf char(15) PRIMARY KEY,"
				    + "primeiroNome varchar(50) NOT NULL,"
				    + "meionome varchar(50),"
				    + "sobrenome varchar(50) NOT NULL,"
				    + "idade int CONSTRAINT idade_positiva CHECK (idade >= 0),"
				    + "peso real CONSTRAINT peso_positivo CHECK (peso > 0))";
			
			// Criando a tabela no banco
			stmt.executeQuery(createTableSQL);
			----------------------------------------------------------------*/
			
		/* 3 - INSERÇÃO DE DADOS */
			// 3.1 ==========================================================
			
			// SQLs para inserir dados
			String insertSQL = "INSERT INTO Pessoa VALUES (?,?,?,?,?,?)";
			
			// Preparando SQL para executar
			PreparedStatement ps = conn.prepareStatement(insertSQL);
			//ps.setString(1, "123.456.789-00"); ps.setString(2, "Fulano");
			//ps.setString(3, null); ps.setString(4, "Silva");
			//ps.setInt(5, 21); ps.setFloat(6, (float) 77.8);
			// ps.executeUpdate();
			
			// ...
			
			//ps.setString(1, "456.789.012-33"); ps.setString(2, "Deltrano");
			//ps.setString(3, null); ps.setString(4, "Dedaleiro");
			//ps.setInt(5, 16); ps.setFloat(6, (float) 65.21);
			//ps.executeUpdate();
			
			
			//ps.setString(1, "567.890.123-44"); ps.setString(2, "Elfano");
			//ps.setString(3, null); ps.setString(4, "Embaúba");
			//ps.setInt(5, 31); ps.setFloat(6, (float) 92.76);
			//ps.executeUpdate();
			
			//ps.setString(1, "678.901.234-55"); ps.setString(2, "Felano");
			//ps.setString(3, "Fedido"); ps.setString(4, "Faveiro");
			//ps.setInt(5, 45); ps.setFloat(6, (float) 73);
			//ps.executeUpdate();
			
			//ps.setString(1, "789.012.345-66"); ps.setString(2, "Gelano");
			//ps.setString(3, null); ps.setString(4, "Gabiroba");
			//ps.setInt(5, 13); ps.setFloat(6, (float) 58.9);
			//ps.executeUpdate();
			
			// Fechando Prepared Statement
			//ps.close();
			// ==============================================================
			
			
			// 3.2 ==========================================================

			// SQLs para inserir dados
//			String insertDataSQL1, insertDataSQL2, insertDataSQL3, insertDataSQL4, insertDataSQL5,
//			insertDataSQL8, insertDataSQL9;
//			
//			insertDataSQL1 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('123.456.789-00', 'Fulano', 'Silva', 21, 77.8)";
//			insertDataSQL2 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('234.567.890-11', 'Beltrano', 'Babaçu', 23, 69.75)";
//			insertDataSQL3 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('345.678.901-22', 'Cicrano', 'Cajueiro', 17, 86)";
//			insertDataSQL4 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('456.789.012-33', 'Deltrano', 'Dedaleiro', 16, 65.21)";
//			insertDataSQL5 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('567.890.123-44', 'Elfano', 'Embaúba', 31, 92.76)";
//			insertDataSQL8 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('890.123.456-77', 'Helano', 'Herbert', 55, 67.4)";
//			insertDataSQL9 = "INSERT INTO pessoa (cpf, primeironome, sobrenome, idade, peso) "
//					+ "VALUES ('901.234.567.88', 'Ilano', 'Imbiruçu', 27, 76)";
//			
//			
//			
//			// Inserindo os dados
//			stmt.executeUpdate(insertDataSQL1);
//			stmt.executeUpdate(insertDataSQL2);
//			stmt.executeUpdate(insertDataSQL3); 
//			stmt.executeUpdate(insertDataSQL4);
//			stmt.executeUpdate(insertDataSQL5);
//			stmt.executeUpdate(insertDataSQL8);
//			stmt.executeUpdate(insertDataSQL9);
			// ==============================================================
			
		/* 4 - Fazendo consulta */
			PreparedStatement consulta = conn.prepareStatement("SELECT * FROM pessoa");
			
			ResultSet resultSet = consulta.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println("CPF: " + resultSet.getString("cpf")+";\n"
						+ "Nome: "+resultSet.getString("primeironome")+ " "+ resultSet.getString("sobrenome")+";\n"
						+ "Idade: "+resultSet.getInt("idade")+";\n"
						+ "Peso: "+resultSet.getFloat("peso")+"\n");
				System.out.println();
			}
			
		/* 3 - Fechando tuto! */
			consulta.close();
			resultSet.close();
			stmt.close();
			conn.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

}