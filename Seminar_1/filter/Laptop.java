public class Laptop {
    // статические члены, если бы были - идут вначале
    private String producer; // поля класса
    private String model; // поля класса

    public Laptop(String producer, String model) { // конструктор, позволяет проинициализировать объект в одну строку с
                                                   // помощью "new"
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() { // делаем get -ы для всех полей
        return producer;
    }

    public String getModel() { // делаем get -ы для всех полей
        return model;           // set -ы пишутся только для того, что может меняться у объекта, стараться не делать, если можно
    }

    @Override //переопределение
    public String toString() { // для красивой печати
        return "Laptop [producer=" + producer + ", model=" + model + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producer == null) ? 0 : producer.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (producer == null) {
            if (other.producer != null)
                return false;
        } else if (!producer.equals(other.producer))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

}
