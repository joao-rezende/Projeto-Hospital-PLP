/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aluno
 */
public enum Especializacao {
    CARDIOLOGISTA {
        @Override
        public String toString() {
            return "Cardiologista";
        }
    },
    NEUROLOGISTA {
        @Override
        public String toString() {
            return "Neurologista";
        }
    },
    CLINICOGERAL {
        @Override
        public String toString() {
            return "Clínico Geral";
        }
    },
    PEDIATRA {
        @Override
        public String toString() {
            return "Pediatra";
        }
    },
    OFTALMOLOGISTA {
        @Override
        public String toString() {
            return "Oftalmologista";
        }
    },
    UROLOGISTA {
        @Override
        public String toString() {
            return "Urologista";
        }
    },
    GINECOLOGISTA {
        @Override
        public String toString() {
            return "Ginecologista";
        }
    },
    ORTOPEDISTA {
        @Override
        public String toString() {
            return "Ortopedista";
        }
    },
    DERMATOLOGISTA {
        @Override
        public String toString() {
            return "Dermatologista";
        }
    },
    PSIQUIATRA {
        @Override
        public String toString() {
            return "Psiquiatra";
        }
    };
}
