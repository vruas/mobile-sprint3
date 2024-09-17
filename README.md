# Golden Data - Sprint 3

## Integrantes

| RA     | Nome                                 | Turma   |
|--------|--------------------------------------|---------|
| 98774  | Gabriel Previ de Oliveira            | 2TDSPV  |
| 97850  | Gustavo Soares Fosaluza              | 2TDSPF  |
| 551692 | Mateus Vinicius da Conceição Silva   | 2TDSPV  |
| 552000 | Pedro Henrique Figueiredo de Oliveira| 2TDSPV  |
| 550871 | Vitor da Silva Ruas                  | 2TDSPV  |



## Explanação do Projeto

### Descrição:
Este projeto é um aplicativo Android que visa criar o início de um projeto em Kotlin, baseado nas ideias futuras do grupo **Golden Data**.

### Funcionalidades:
- Tela de boas-vindas
- Tela de login
- Tela de recuperação de senha
- Tela de registro
- Tela principal

### Tecnologias Utilizadas:
- Kotlin
- Android SDK

## Estrutura do Projeto

### Pastas:
- `app/kotlin+java/sprint3/`: Contém as atividades e classes Kotlin do aplicativo.
- `app/res/layout/`: Contém os arquivos de layout XML.
- `app/res/values/`: Contém os arquivos de valores (cores, strings, estilos).

## Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone <URL>
2. Navegue até a pasta do projeto: cd Sprint3
3. Abra o projeto no Android Studio
4. Compile e execute o aplicativo no emulador ou dispositivo

Sprint3/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── sprint3/
│   │   │   │               ├── ForgotPasswordActivity.kt
│   │   │   │               ├── LoginActivity.kt
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── RegisterActivity.kt
│   │   │   │               └── WelcomeActivity.kt
│   │   │   │
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   ├── activity_forgot_password.xml
│   │   │       │   ├── activity_login.xml
│   │   │       │   ├── activity_main.xml
│   │   │       │   ├── activity_register.xml
│   │   │       │   └── activity_welcome.xml
│   │   │       │
│   │   │       ├── values/
│   │   │       │   ├── colors.xml
│   │   │       │   ├── strings.xml
│   │   │       │   └── styles.xml
│   │   │       │
│   │   │       └── drawable/
│   │   │           └── (Imagens e ícones, se houver)
│   │   │
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── example/
│   │                   └── sprint3/
│   │                       └── (Testes unitários, se houver)
│   │
│   ├── build.gradle
│   └── AndroidManifest.xml
│
├── gradle/
│   └── wrapper/
│
├── .gitignore
├── build.gradle
├── settings.gradle
└── README.md
 
