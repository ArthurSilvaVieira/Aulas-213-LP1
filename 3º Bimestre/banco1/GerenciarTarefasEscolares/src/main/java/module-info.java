module br.art.gerenciartarefasescolares {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;


    opens br.art.gerenciartarefasescolares to javafx.fxml;
    opens  br.art.gerenciartarefasescolares.model to org.hibernate.orm.core;
    exports br.art.gerenciartarefasescolares;
}