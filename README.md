#SOLID

A sigla SOLID é um acrônimo para cinco princípios básicos de design de software que foram descritos por Robert C. Martin. Cada letra da sigla representa um desses princípios:

S - Single Responsibility Principle (Princípio da Responsabilidade Única): cada classe ou método deve ter apenas uma responsabilidade. Isso ajuda a manter o código organizado e facilita a manutenção e a reutilização.

O - Open/Closed Principle (Princípio Aberto/Fechado): as classes devem estar abertas para extensão, mas fechadas para modificação. Isso significa que o comportamento de uma classe pode ser estendido(implementar novas funcionalidades) sem alterar seu código-fonte original.

L - Liskov Substitution Principle (Princípio da Substituição de Liskov): as classes derivadas devem ser substituíveis por suas classes base sem afetar a integridade do sistema. Em outras palavras, uma classe deve ser capaz de ser usada em qualquer lugar onde sua classe base é esperada.(Podemos usar composição no lugar de herança)

I - Interface Segregation Principle (Princípio da Segregação de Interface): as interfaces devem ser específicas para o uso pretendido. Isso significa que as classes não devem ser forçadas a implementar interfaces que não são relevantes para elas.

D - Dependency Inversion Principle (Princípio da Inversão de Dependência): os módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, as abstrações não devem depender dos detalhes. Em vez disso, os detalhes devem depender das abstrações.

Em resumo, esses princípios ajudam a criar um código mais modular, flexível e fácil de manter. Eles são amplamente usados em desenvolvimento de software para criar sistemas que possam ser facilmente atualizados, modificados e mantidos ao longo do tempo.