

public enum Month {

    JANUARY("Январь"),    FEBRUARY("Февраль"),
    MARCH("Март"),    APRIL("Апрель"),    MAY("Май"),
    JUNE("Июнь"),    JULY("Июль"),    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),    DECEMBER("Декабрь"),
    UNKNOWN_ERROR("Неизвестная ошибка");

    String translation;

    Month(String translation){
      this.translation = translation;
    }

    @Override
    public String toString(){
        return "У них там: "+ this.name() + ".\nА у нас здесь: " + this.translation;
    }
    
}
