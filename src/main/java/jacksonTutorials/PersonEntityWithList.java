package jacksonTutorials;

import java.util.List;

public class PersonEntityWithList {
    private String name;
    private String familyName;

    private List<String> Tasks;

    private Mechin mechin;

    public PersonEntityWithList(){}

    public PersonEntityWithList(String name, String familyName, List<String> tasks, Mechin mechin) {
        this.name = name;
        this.familyName = familyName;
        Tasks = tasks;
        this.mechin = mechin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<String> getTasks() {
        return Tasks;
    }

    public void setTasks(List<String> tasks) {
        Tasks = tasks;
    }

    public Mechin getMechin() {
        return mechin;
    }

    public void setMechin(Mechin mechin) {
        this.mechin = mechin;
    }

    public static class Mechin{
        private double powerEngine;
        private String name;
        private String model;

        public Mechin(){}

        public Mechin(double powerEngine, String name, String model) {
            this.powerEngine = powerEngine;
            this.name = name;
            this.model = model;
        }

        public double getPowerEngine() {
            return powerEngine;
        }

        public void setPowerEngine(double powerEngine) {
            this.powerEngine = powerEngine;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
