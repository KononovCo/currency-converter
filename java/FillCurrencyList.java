package com.example.currencyconverter;

import java.util.ArrayList;

public class FillCurrencyList {

    private Object[][] getData() {
        return new Object[][] {
                {R.drawable.euro,                              "EUR (Евро)",                              "Евросоюз"},
                {R.drawable.russia,                            "RUB (Российский рубль)",                  "Россия (Москва)"},

                {R.drawable.america,                           "USD (Доллар США)",                        "Америка (Вашингтон)"},
                {R.drawable.aruba,                             "AWG (Арубанский флорин)",                 "Аруба (Ораньестад)"},
                {R.drawable.angola,                            "AOA (Ангольская кванза)",                 "Ангола (Луанда)"},
                {R.drawable.algeria,                           "DZD (Алжирский динар)",                   "Алжир (Алжир)"},
                {R.drawable.albania,                           "ALL (Албанский лек)",                     "Албания (Тирана)"},
                {R.drawable.england,                           "GBP (Фунт стерлингов)",                   "Англия (Лондон)"},
                {R.drawable.armenia,                           "AMD (Армянский драм)",                    "Армения (Ереван)"},
                {R.drawable.argentina,                         "ARS (Аргентинское песо)",                 "Аргентина (Буэнос-Айрес)"},
                {R.drawable.australia,                         "AUD (Австралийский доллар)",              "Австралия (Канберра)"},
                {R.drawable.azerbaijan,                        "AZN (Азербайджанский манат)",             "Азербайджан (Баку)"},
                {R.drawable.afghanistan,                       "AFN (Афганский афгани)",                  "Афганистан (Кабул)"},
                {R.drawable.antigua_and_barbuda,               "XCD (Восточно-карибский доллар)",         "Антигуа и Барбуда (Сент-Джонс)"},

                {R.drawable.bahamas,                           "BSD (Багамский доллар)",                  "Багамы (Нассау)"},
                {R.drawable.bahrain,                           "BHD (Бахрейнский динар)",                 "Бахрейн (Манама)"},
                {R.drawable.bangladesh,                        "BDT (Бангладешская така)",                "Бангладеш (Дакка)"},
                {R.drawable.barbados,                          "BBD (Барбадосский доллар)",               "Барбадос (Бриджтаун)"},
                {R.drawable.belarus,                           "BYN (Белорусский рубль)",                 "Белоруссия (Минск)"},
                {R.drawable.belize,                            "BZD (Белизский доллар)",                  "Белиз (Бельмопан)"},
                {R.drawable.benin,                             "XOF (Западноафриканский франк КФА)",      "Бенин (Порто-Ново)"},
                {R.drawable.bermuda,                           "BMD (Бермудский доллар)",                 "Бермуды (Гамильтон)"},
                {R.drawable.bhutan,                            "BTN (Бутанский нгултрум)",                "Бутан (Тхимпху)"},
                {R.drawable.bolivia,                           "BOB (Боливийский боливиано)",             "Боливия (Ла-Пас, Сукре)"},
                {R.drawable.bosnia_and_herzegovina,            "BAM (Конвертируемая марка)",              "Босния и Герцеговина (Сараево)"},
                {R.drawable.botswana,                          "BWP (Ботсванская пула)",                  "Ботсвана (Габороне)"},
                {R.drawable.brazil,                            "BRL (Бразильский реал)",                  "Бразилия (Бразилиа)"},
                {R.drawable.brunei,                            "BND (Брунейский доллар)",                 "Бруней (Бандар-Сери-Бегаван)"},
                {R.drawable.bulgaria,                          "BGN (Болгарский лев)",                    "Болгария (София)"},
                {R.drawable.burundi,                           "BIF (Бурундийский франк)",                "Бурунди (Гитега)"},

                {R.drawable.hungary,                           "HUF (Венгерский форинт)",                 "Венгрия (Будапешт)"},
                {R.drawable.vanuatu,                           "VUV (Вануатский вату)",                   "Вануату (Порт-Вила)"},
                {R.drawable.venezuela,                         "VES (Суверенный боливар)",                "Венесуэла (Каракас)"},
                {R.drawable.vietnam,                           "VND (Вьетнамский донг)",                  "Вьетнам (Ханой)"},

                {R.drawable.gabon,                             "XAF (Центральноафриканский франк)",       "Габон (Либревиль)"},
                {R.drawable.gambia,                            "GMD (Гамбийский даласи)",                 "Гамбия (Банжул)"},
                {R.drawable.georgia,                           "GEL (Грузинский лари)",                   "Грузия (Тбилиси)"},
                {R.drawable.ghana,                             "GHS (Ганский седи)",                      "Гана (Аккра)"},
                {R.drawable.guatemala,                         "GTQ (Гватемальская кетсаль)",             "Гватемала (Гватемала)"},
                {R.drawable.guinea,                            "GNF (Гвинейский франк)",                  "Гвинея (Конакри)"},
                {R.drawable.guyana,                            "GYD (Гайанский доллар)",                  "Гайана (Джорджтаун)"},
                {R.drawable.haiti,                             "HTG (Гаитянский гурд)",                   "Гаити (Порт-о-Пренс)"},
                {R.drawable.honduras,                          "HNL (Гондурасская лемпира)",              "Гондурас (Тегусигальпа)"},
                {R.drawable.hong_kong,                         "HKD (Гонконгский доллар)",                "Гонконг"},

                {R.drawable.democratic_republic_congo,         "CDF (Конголезский франк)",                "Демократическая Республика Конго (Киншаса)"},
                {R.drawable.denmark,                           "DKK (Датская крона)",                     "Дания (Копенгаген)"},
                {R.drawable.djibouti,                          "DJF (Джибутийский франк)",                "Джибути (Джибути)"},
                {R.drawable.dominican_republic,                "DOP (Доминиканское песо)",                "Доминиканская Республика (Санто-Доминго)"},

                {R.drawable.egypt,                             "EGP (Египетский фунт)",                   "Египет (Каир)"},

                {R.drawable.zambia,                            "ZMW (Замбийская квача)",                  "Замбия (Лусака)"},
                
                {R.drawable.iceland,                           "ISK (Исландская крона)",                  "Исландия (Рейкьявик)"},
                {R.drawable.india,                             "INR (Индийская рупия)",                   "Индия (Нью-Дели)"},
                {R.drawable.indonesia,                         "IDR (Индонезийская рупия)",               "Индонезия (Джакарта)"},
                {R.drawable.iran,                              "IRR (Иранский риал)",                     "Иран (Тегеран)"},
                {R.drawable.iraq,                              "IQD (Иракский динар)",                    "Ирак (Багдад)"},
                {R.drawable.israel,                            "ILS (Новый израильский шекель)",          "Израиль (Иерусалим)"},
                {R.drawable.jordan,                            "JOD (Иорданский динар)",                  "Иордания (Амман)"},

                {R.drawable.yemen,                             "YER (Йеменский риал)",                    "Йемен (Сана)"},

                {R.drawable.cayman_islands,                    "KYD (Доллар Каймановых Островов)",        "Каймановы Острова (Джорджтаун)"},
                {R.drawable.cambodia,                          "KHR (Камбоджийский риель)",               "Камбоджа (Пном Пен)"},
                {R.drawable.canada,                            "CAD (Канадский доллар)",                  "Канада (Оттава)"},
                {R.drawable.cape_verde,                        "CVE (Эскудо Кабо-Верде)",                 "Кабо-Верде (Прая)"},
                {R.drawable.china,                             "CNY (Китайский юань)",                    "Китай (Пекин)"},
                {R.drawable.colombia,                          "COP (Колумбийское песо)",                 "Колумбия (Богота)"},
                {R.drawable.costa_rica,                        "CRC (Коста-риканский колон)",             "Коста-Рика (Сан-Хосе)"},
                {R.drawable.cuba,                              "CUP (Кубинское песо)",                    "Куба (Гавана)"},
                {R.drawable.kazakhstan,                        "KZT (Казахстанский тенге)",               "Казахстан (Астана)"},
                {R.drawable.kenya,                             "KES (Кенийский шиллинг)",                 "Кения (Найроби)"},
                {R.drawable.comoros,                           "KMF (Коморский франк)",                   "Коморы (Морони)"},
                {R.drawable.kuwait,                            "KWD (Кувейтский динар)",                  "Кувейт (Эль-Кувейт)"},
                {R.drawable.kyrgyzstan,                        "KGS (Киргизский сом)",                    "Киргизия (Бишкек)"},
                {R.drawable.qatar,                             "QAR (Катарский риал)",                    "Катар (Доха)"},
                {R.drawable.north_korea,                       "KPW (Северокорейская вона)",              "Северная Корея (Пхеньян)"},
                {R.drawable.south_korea,                       "KRW (Южнокорейская вона)",                "Южная Корея (Сеул)"},

                {R.drawable.laos,                              "LAK (Лаосский кип)",                      "Лаос (Вьентьян)"},
                {R.drawable.lebanon,                           "LBP (Ливанский фунт)",                    "Ливан (Бейрут)"},
                {R.drawable.liberia,                           "LRD (Либерийский доллар)",                "Либерия (Монровия)"},
                {R.drawable.libya,                             "LYD (Ливийский динар)",                   "Ливия (Триполи)"},

                {R.drawable.madagascar,                        "MGA (Малагасийских ариари)",              "Мадагаскар (Антананариву)"},
                {R.drawable.malawi,                            "MWK (Малавийская квача)",                 "Малави (Лилонгве)"},
                {R.drawable.malaysia,                          "MYR (Малайзийский ринггит)",              "Малайзия (Куала-Лумпур)"},
                {R.drawable.maldives,                          "MVR (Мальдивская руфия)",                 "Мальдивы (Мале)"},
                {R.drawable.mauritania,                        "MRU (Мавританских угий)",                 "Мавритания (Нуакшот)"},
                {R.drawable.mauritius,                         "MUR (Маврикийская рупия)",                "Маврикий (Порт-Луи)"},
                {R.drawable.mexico,                            "MXN (Мексиканское песо)",                 "Мексика (Мехико)"},
                {R.drawable.moldova,                           "MDL (Молдавский лей)",                    "Молдавия (Кишинёв)"},
                {R.drawable.mongolia,                          "MNT (Монгольский тугрик)",                "Монголия (Улан-Батор)"},
                {R.drawable.morocco,                           "MAD (Марокканский дирхам)",               "Марокко (Рабат)"},
                {R.drawable.mozambique,                        "MZN (Мозамбикских метикалов)",            "Мозамбик (Мапуту)"},
                {R.drawable.myanmar,                           "MMK (Мьянманский кьят)",                  "Мьянма (Нейпьидо)"},

                {R.drawable.namibia,                           "NAD (Намибийский доллар)",                "Намибия (Виндхук)"},
                {R.drawable.nepal,                             "NPR (Непальская рупия)",                  "Непал (Катманду)"},
                {R.drawable.new_zealand,                       "NZD (Новозеландский доллар)",             "Новая Зеландия (Веллингтон)"},
                {R.drawable.nicaragua,                         "NIO (Никарагуанская кордоба)",            "Никарагуа (Манагуа)"},
                {R.drawable.nigeria,                           "NGN (Нигерская найра)",                   "Нигер (Ниамей)"},
                {R.drawable.norway,                            "NOK (Норвежская крона)",                  "Норвегия (Осло)"},

                {R.drawable.uae,                               "AED (Дирхам ОАЭ)",                        "Объединённые Арабские Эмираты (Абу-Даби)"},

                {R.drawable.pakistan,                          "PKR (Пакистанская рупия)",                "Пакистан (Исламабад)"},
                {R.drawable.panama,                            "PAB (Панамский бальбоа)",                 "Панама (Панама)"},
                {R.drawable.papua_new_guinea,                  "PGK (Кина)",                              "Папуа — Новая Гвинея (Порт-Морсби)"},
                {R.drawable.paraguay,                          "PYG (Парагвайский гуарани)",              "Парагвай (Асунсьон)"},
                {R.drawable.peru,                              "PEN (Перуанский новый соль)",             "Перу (Лима)"},
                {R.drawable.poland,                            "PLN (Польский злотый)",                   "Польша (Варшава)"},

                {R.drawable.romania,                           "RON (Румынский лей)",                     "Румыния (Бухарест)"},
                {R.drawable.rwanda,                            "RWF (Руандский франк)",                   "Руанда (Кигали)"},

                {R.drawable.northern_macedonia,                "MKD (Македонский денар)",                 "Северная Македония (Скопье)"},
                {R.drawable.samoa,                             "WST (Самоанская тала)",                   "Самоа (Апиа)"},
                {R.drawable.sao_tome_and_principe,             "STD (Добра Сан-Томе и Принсипи)",         "Сан-Томе и Принсипи (Сан-Томе)"},
                {R.drawable.saudi_arabia,                      "SAR (Саудовский риал)",                   "Саудовская Аравия (Эр-Рияд)"},
                {R.drawable.serbia,                            "RSD (Сербский динар)",                    "Сербия (Белград)"},
                {R.drawable.seychelles,                        "SCR (Сейшельская рупия)",                 "Сейшелы (Виктория)"},
                {R.drawable.sierra_leone,                      "SLE (Леоне)",                             "Сьерра-Леоне (Фритаун)"},
                {R.drawable.singapore,                         "SGD (Сингапурский доллар)",               "Сингапур (Сингапур)"},
                {R.drawable.solomon_islands,                   "SBD (Доллар Соломоновых Островов)",       "Соломоновы Острова (Хониара)"},
                {R.drawable.somalia,                           "SOS (Сомалийский шиллинг)",               "Сомали (Могадишо)"},
                {R.drawable.sudan,                             "SDG (Суданский фунт)",                    "Судан (Хартум)"},
                {R.drawable.suriname,                          "SRD (Суринамский доллар)",                "Суринам (Парамарибо)"},
                {R.drawable.syria,                             "SYP (Сирийский фунт)",                    "Сирия (Дамаск)"},
                {R.drawable.swaziland,                         "SZL (Свазилендский лилангени)",           "Свазиленд (Мбабане, Лобамба)"},

                {R.drawable.tajikistan,                        "TJS (Таджикский сомони)",                 "Таджикистан (Душанбе)"},
                {R.drawable.tanzania,                          "TZS (Танзанийский шиллинг)",              "Танзания (Додома)"},
                {R.drawable.thailand,                          "THB (Тайский бат)",                       "Таиланд (Бангкок)"},
                {R.drawable.tonga,                             "TOP (Тонганская паанга)",                 "Тонга (Нукуалофа)"},
                {R.drawable.trinidad_and_tobago,               "TTD (Доллар Тринидада и Тобаго)",         "Тринидад и Тобаго (Порт-оф-Спейн)"},
                {R.drawable.tunisia,                           "TND (Тунисский динар)",                   "Тунис (Тунис)"},
                {R.drawable.turkey,                            "TRY (Турецкая лира)",                     "Турция (Анкара)"},
                {R.drawable.turkmenistan,                      "TMT (Туркменский манат)",                 "Туркменистан (Ашхабад)"},

                {R.drawable.uganda,                            "UGX (Угандийский шиллинг)",               "Уганда (Кампала)"},
                {R.drawable.ukraine,                           "UAH (Украинская гривна)",                 "Украина (Киев)"},
                {R.drawable.uruguay,                           "UYU (Уругвайское песо)",                  "Уругвай (Монтевидео)"},
                {R.drawable.uzbekistan,                        "UZS (Узбекский сум)",                     "Узбекистан (Ташкент)"},

                {R.drawable.falkland_islands,                  "FKP (Фунт Фолклендских Островов)",        "Фолклендские Острова (Стэнли)"},
                {R.drawable.fiji,                              "FJD (Фиджийский доллар)",                 "Фиджи (Сува)"},
                {R.drawable.philippines,                       "PHP (Филиппинское песо)",                 "Филиппины (Манила)"},

                {R.drawable.chile,                             "CLP (Чилийское песо)",                    "Чили (Сантьяго)"},
                {R.drawable.czech,                             "CZK (Чешская крона)",                     "Чехия (Прага)"},

                {R.drawable.sri_lanka,                         "LKR (Шри-ланкийская рупия)",              "Шри-Ланка (Шри-Джаяварденепура-Котте)"},
                {R.drawable.sweden,                            "SEK (Шведская крона)",                    "Швеция (Стокгольм)"},
                {R.drawable.switzerland,                       "CHF (Швейцарский франк)",                 "Швейцария (Берн)"},

                {R.drawable.eritrea,                           "ERN (Эритрейская накфа)",                 "Эритрея (Асмэра)"},
                {R.drawable.ethiopia,                          "ETB (Эфиопский быр)",                     "Эфиопия (Аддис-Абеба)"},

                {R.drawable.south_africa,                      "ZAR (Южноафриканский рэнд)",              "ЮАР (Кейптаун)"},
                {R.drawable.south_sudan,                       "SSP (Южносуданский фунт)",                "Южный Судан (Джуба)"},

                {R.drawable.jamaica,                           "JMD (Ямайский доллар)",                   "Ямайка (Кингстон)"},
                {R.drawable.japan,                             "JPY (Японская иена)",                     "Япония (Токио)"}
        };
    }

    public ArrayList<Integer> getFlagList() {
        ArrayList<Integer> flagList = new ArrayList<>();

        for (int i = 0; i < getData().length; i++) flagList.add((Integer) getData()[i][0]);
        return flagList;
    }

    public ArrayList<String> getCurrencyList() {
        ArrayList<String> currencyList = new ArrayList<>();

        for (int i = 0; i < getData().length; i++) currencyList.add((String) getData()[i][1]);
        return currencyList;
    }

    public ArrayList<String> getStateList() {
        ArrayList<String> stateList = new ArrayList<>();

        for (int i = 0; i < getData().length; i++) stateList.add((String) getData()[i][2]);
        return stateList;
    }

}