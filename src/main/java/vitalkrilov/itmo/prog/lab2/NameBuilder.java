package vitalkrilov.itmo.prog.lab2;

import java.util.Random;

public class NameBuilder {

    private static Random r = new Random();

    public static String[] male_names = { "Абрам", "Аввакум", "Аверкий", "Аверьян", "Авксентий", "Авраам", "Авсентий", "Автоном", "Агапий", "Агафон", "Агафонаил", "Агафоник", "Аггей", "Адриан", "Акакий", "Аким", "Акиндин", "Акинфий", "Аксентий", "Алексей", "Ананий", "Андрей", "Андриан", "Андрон", "Андроник", "Анемподист", "Аника", "Анисим", "Анисифор", "Антип", "Антипиоген", "Антиподист", "Антон", "Антоний", "Апполон", "Арефий", "Аристарх", "Аркадий", "Арсений", "Артамон", "Артемий", "Архип", "Афанасий", "Афиноген", "Африкан", "Борис", "Вавил", "Валерьян", "Варлаам", "Василий", "Вениамин", "Венидикт", "Виктор", "Виссарион", "Владимир", "Ворфоломей", "Гавриил", "Галактион", "Герасим", "Герман", "Гермоген", "Гордей", "Григорий", "Гурий", "Гурьян", "Давыд", "Дамьян", "Даниил", "Данил", "Дементий", "Демид", "Демьян", "Дий", "Димитрий", "Дмитрий", "Дормидонт", "Дорофей", "Евгений", "Евграф", "Евдоким", "Евксентий", "Евлампий", "Евлентий", "Евмений", "Евсей", "Евсигней", "Евфим", "Егор", "Елеазар", "Елизар", "Елисей", "Еллазарий", "Емельян", "Епифаний", "Ераст", "Еремей", "Ермоген", "Ермолай", "Ерофей", "Ефим", "Захар", "Захария", "Зиновий", "Зотик", "Иван", "Игнат", "Игнатий", "Иероним", "Илларион", "Иллизар", "Илья", "Иоаким", "Иоанн", "Иов", "Иона", "Иосип", "Иосиф", "Ипатий", "Ипполит", "Ирадион", "Исаакий", "Исаия", "Исидор", "Исмаил", "Иурий", "Каллистрат", "Капитон", "Карп", "Кассиан", "Кирилл", "Кирсан", "Кирьян", "Клементий", "Климент", "Кон", "Кондратий", "Конон", "Константин", "Корнил", "Корнилий", "Косьма", "Ксенофонт", "Кузьма", "Лавр", "Лаврентий", "Ларион", "Лев", "Леонтий", "Липат", "Логин", "Лука", "Лукиан", "Лукоян", "Лупп", "Макар", "Макарий", "Максим", "Малафей", "Мамонт", "Маркел", "Мартемьян", "Мартын", "Матвей", "Мелентий", "Мемеон", "Меркурий", "Мефиурий", "Мефодий", "Мин", "Миней", "Мирон", "Митрофан", "Михаил", "Михей", "Мокей", "Назар", "Наум", "Неофит", "Нестор", "Никандр", "Никанор", "Никита", "Никифор", "Никодим", "Николай", "Никон", "Никонор", "Нил", "Окинфий", "Олимпий", "Онофрий", "Онтифий", "Онуфрий", "Орефий", "Ортемий", "Осип", "Осия", "Павел", "Пантелей", "Пантелеймон", "Панфил", "Парамон", "Парфен", "Парфений", "Патрикей", "Пахомий", "Перфил", "Петр", "Пимон", "Платон", "Поливаний", "Полиевкт", "Поликарп", "Порфирий", "Потап", "Прокопий", "Прокофий", "Протасий", "Прохор", "Рафаил", "Роман", "Руф", "Савва", "Савватий", "Савелий", "Самсон", "Самуил", "Сафон", "Севастьян", "Селиверст", "Семен", "Серафим", "Сергей", "Сиверьян", "Сидор", "Сил", "Силантий", "Сильверст", "Сильвестр", "Симеон", "Симон", "Созон", "Софрон", "Спиридон", "Степан", "Стефан", "Тарас", "Тарасий", "Терентий", "Тимофей", "Тит", "Трифон", "Трофим", "Уар", "Ульян", "Устин", "Фаддей", "Фатей", "Федор", "Федот", "Феодор", "Феодосий", "Феодул", "Феоктид", "Феоктист", "Феофан", "Феофил", "Ферапонт", "Ферафонт", "Филарет", "Филимон", "Филипп", "Фирст", "Флегонт", "Флор", "Фока", "Фома", "Фотий", "Фотин", "Фрол", "Фронтасий", "Харитон", "Харлампий", "Хринсиф", "Христофор", "Эммануил", "Яков" };

    public static String[] female_names = { "Августа", "Авдотья", "Агапия", "Агния", "Агрипина", "Акилина", "Акулина", "Александра", "Алимпиада", "Анастасия", "Анисья", "Анна", "Антонида", "Анфиса", "Апполинария", "Арина", "Аристинья", "Афанасия", "Варвара", "Василиса", "Васса", "Виктория", "Виринея", "Глафира", "Гликерия", "Дарья", "Домна", "Домникия", "Евгения", "Евдокия", "Евлампия", "Евпраксия", "Евфимия", "Екатерина", "Елена", "Елизавета", "Епистимья", "Ефросинья", "Зиновия", "Ираида", "Ирина", "Иулиания", "Клавдия", "Клеопатра", "Ксения", "Лидия", "Лукерья", "Лукия", "Любовь", "Мавра", "Марва", "Маргарита", "Мариамна", "Марианна", "Марина", "Мария", "Марфа", "Матрена", "Матрона", "Мелания", "Миления", "Минодора", "Надежда", "Настасья", "Наталия", "Неонила", "Нонна", "Огара", "Олимпиада", "Ольга", "Онисья", "Павлиния", "Пелагея", "Пераскева", "Прасковья", "Пульхерия", "Раида", "Раиса", "Саималида", "Серафима", "Симионида", "Синклитинья", "Снандулия", "Соломонида", "Соломония", "София", "Степанида", "Стефанида", "Стефания", "Таисия", "Татьяна", "Укулина", "Улита", "Ульяна", "Устиния", "Фаина", "Февронья", "Фекла", "Феламения", "Фелицата", "Феодора", "Феодосия", "Феодотья", "Феоктинья", "Феоктиста", "Фиона", "Фотинья", "Харитония", "Хевронья", "Хиония", "Христиния", "Юлия" };

    public static String generateMaleName() {
        return male_names[r.nextInt(male_names.length)];
    }

    public static String generateFemaleName() {
        return female_names[r.nextInt(female_names.length)];
    }

    public static String generateName() {
        return r.nextBoolean() ? generateMaleName() : generateFemaleName();
    }

}
