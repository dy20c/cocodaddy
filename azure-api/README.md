Azure - API

    1. Skills
        1) SpringBoot
        2) Spring Webflux
        3) Spring data
            Entity
            Repository
        4) Spring Clud Streams
        5) Docker


    2. MacOS Spring CLI
    OSX Homebrew Installation
    If you are on a Mac and use Homebrew, you can install the Spring Boot CLI by using the following commands:

    $ brew tap spring-io/tap
    $ brew install spring-boot

    Homebrew installs spring to /usr/local/bin.

    3. BOOK : Hands-On-Microsevices-with-Spring-Boot-and-Spring-Cloud
    해당 폴더를 가리키는 환경 변수 $BOOK_HOME을 설정해야 커맨드를 실행할 수 있다.,
    export BOOK_HOME=~/Document/Hands-On-Microsevices-with-Spring-Boot-and-Spring-Cloud
    git clone https://github.comPacktPublishing/Hands-On-Microsevices-with-Spring-Boot-and-Spring-Cloud $BOOK_HOME
    cd $BOOK_HOME/Chapter03

    4. Microservice Project skeleton code (Spring CLI)
    spring init \
    --boot-version=2.4.5 \
    --build=gradle \
    --java-version=1.8 \
    --packaging=jar \
    --name=product-service \
    --package-name=se.magnus.microsevices.core.product \
    --groupId=se.magnus.microservices.core.product \
    --dependencies=actuator,webflux \
    --version=1.0.0-SNAPSHOT \
    product-service