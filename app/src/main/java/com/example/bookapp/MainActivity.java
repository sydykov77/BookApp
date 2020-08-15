package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bookapp.interfaces.OnBookClickListener;
import com.example.bookapp.model.BooksModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BookAdapter adapter;
    private ArrayList<BooksModels> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();
        list.add(new BooksModels(
                "Цветы для Элджернона",
                "«Сорок лет назад это считалось фантастикой. Сорок лет назад это читалось как фантастика.Исследующая и расширяющая границы жанра, жадно впитывающая всевозможные новейшие веяния,примеряющая общечеловеческое лицо, отважно игнорирующая каинову печать\"жанрового гетто\". Сейчас это воспринимается как одно из самых человечных произведений новейшего времени, как роман пронзительной психологической силы, как филигранное развитие темы любви и ответственности. Не зря вышедшую уже в 1990-е книгу воспоминаний Киз назвал \"Элджернон, Чарли и я\"."));
        list.add(new BooksModels(
                "451° по Фаренгейту",
                "Мастер мирового масштаба, совмещающий в литературе несовместимое.Создатель таких ярчайших шедевров, как \"Марсианские хроники\", \"451° по Фаренгейту\", \"Вино из одуванчиков\" и так далее и так далее. Лауреат многочисленных премий. Это Рэй Брэдбери. Его увлекательные истории прославили автора не только как непревзойденного рассказчика, но и как философа, мыслителя и психолога.Магический реализм его прозы, рукотворные механизмы радости, переносящие человека из настоящего в волшебные миры детства, чудо приобщения к великой тайне Литературы, щедро раздариваемое читателю, давно вывели Брэдбери на высокую классическую орбиту. Собранные в этой книге произведения -достойное тому подтверждение."));
        list.add(new BooksModels(
                "Портрет Дориана Грея",
                "«Портрет Дориана Грея» – одно из величайших произведений последних полутора столетий, роман, который пытались запретить, а автора осуждали за «непристойное поведение». Превращение прекрасного и невинного юноши Дориана в чудовище под влиянием гедонистических идей и циничных афоризмов лорда Генри – в романе, породившем культ вечной молодости."));
        list.add(new BooksModels(
                "«Атлант расправил плечи»",
                "Айн Рэнд - наша бывшая соотечественница, ставшая крупнейшей американской писательницей. Автор четырех романов-бестселлеров и многочислен\u00ADных статей. Создатель философской концепции, в основе которой лежит принцип свободы воли, главенство рациональности и \"нравственность разумного эгоизма\". Ее книги читает весь мир. В США она завоевала огромную популярность, ее ро\u00ADманы переиздаются из года в год и по совокупности тиражей конкурируют с Биб\u00ADлией. Всемирное признание Айн Рэнд нетрудно объяснить: исключительный дар предвидения в самых разных областях - политике, бизнесе, экономике, обществен\u00ADных отношениях - в сочетании с художественной одаренностью принесли ей славу большого писателя и проницательного мыслителя. АТЛАНТ РАСПРАВИЛ ПЛЕЧИ, самое значимое произведение своей жизни, она писала 12 лет."));
        list.add(new BooksModels(
                "Евгений Онегин",
                "«Евгений Онегин» — роман в стихах Александра Сергеевича Пушкина, написанный в 1823—1831 годах, одно из самых значительных произведений русской словесности. Пушкин работал над этим романом свыше семи лет.\n" +
                        "На широком фоне картин русской жизни показана драматическая судьба лучших людей дворянской интеллигенции. В центре романа — любовная интрига. А главной проблемой является вечная проблема чувства и долга."));
        list.add(new BooksModels(
                "Гарри Поттер и философский камень",
                "«Самая знаменитая сага новейшего времени разошлась рекордным тиражом - более 400 миллионов экземпляров на 68 языках (включая эсперанто, древнегреческий и латынь). Книги Роулинг сумели оторвать детей и взрослых от экранов компьютеров и стали мощнейшим импульсом для интереса к чтению в современную эпоху.\n" +
                        "\n" +
                        "Жизнь десятилетнего Гарри Поттера нельзя назвать сладкой: его родители умерли, едва ему исполнился год, а от дяди и тётки, взявших сироту на воспитание, достаются лишь тычки да подзатыльники. Но в одиннадцатый день рождения Гарри всё меняется. Странный гость, неожиданно появившийся на пороге, приносит письмо, из которого мальчик узнаёт, что на самом деле он чистокровный волшебник и принят в Хогвартс — школу магии. А уже через пару недель Гарри будет мчаться в поезде Хогвартс-экспресс навстречу новой жизни, где его ждут невероятные приключения, верные друзья и самое главное — ключ к разгадке тайны смерти его родителей."));
        list.add(new BooksModels(
                "Великий Гэтсби",
                "\"Великий Гэтсби\" - вершина не только в творчестве Ф. С. Фицджеральда, но и одно из высших достижений в мировой прозе XX века. Хотя действие романа происходит в \"бурные\" двадцатые годы прошлого столетия, когда состояния делались буквально из ничего и вчерашние преступники в одночасье становились миллионерами, книга эта живет вне времени, ибо, повествуя о сломанных судьбах поколения \"века джаза\", давно стала универсальным символом бессмысленности погони человека за ложной целью."));
        list.add(new BooksModels(
                "Бойцовский клуб",
                "«Это — самая потрясающая и самая скандальная книга 1990-х. Книга, в которой устами Чака Паланика заговорило не просто \"Поколение Икс\", но — \"Поколение Икс\" уже озлобленное, уже растерявшее свои последние иллюзии. Вы смотрели фильм \"Бойцовский клуб\"? Тогда — читайте книгу, по которой он был снят."));

        list.add(new BooksModels(
                "Зелёная миля",
                "Стивен Кинг приглашает читателей в жуткий мир тюремного блока смертников, откуда уходят, чтобы не вернуться, приоткрывает дверь последнего пристанища тех, кто преступил не только человеческий, но и Божий закон. По эту сторону электрического стула нет более смертоносного местечка! Ничто из того, что вы читали раньше, не сравнится с самым дерзким из ужасных опытов Стивена Кинга — с историей, что начинается на Дороге Смерти и уходит в глубины самых чудовищных тайн человеческой души…\n" +
                        "Глубокий старик Пол Эджкомб, бывший тюремный надзиратель над смертниками, вспоминает необыкновенные события особенной в его жизни осени 1932 года, когда в нее вошел странный чернокожий гигант Джон Коффи.\n" +
                        "В 1999 году по роману был снят одноимённый фильм."));
        list.add(new BooksModels(
                "Герой нашего времени",
                "«Героой наашего времени» (написан в 1838—1840) — знаменитый роман Михаила Юрьевича Лермонтова, классика русской литературы. Роман состоит из нескольких частей, хронологический порядок которых нарушен.\n" +
                        "Образ Печорина — одно из художественных открытий Лермонтова. Печоринский тип поистине эпохален, и прежде всего потому, что в нем получили концентрированное выражение особенности последекабристской эпохи, когда на поверхности «видны были только потери, жестокая реакция», внутри же «совершалась великая работа… глухая и безмолвная, но деятельная и беспрерывная …»"));
        list.add(new BooksModels(
                "Алхимик",
                "Эта удивительная книга Пауло Коэльо вдохновляет читателей во всем мире. В этой истории, сочетающей в себе простоту силы и вдохновение мудрости, повествуется о юном пастухе из Андалузии по имени Сантьяго. Он покидает родную Испанию и отправляется в Египет, чтобы обрести сокровище, сокрытое среди пирамид. По пути он встречает цыганку, человека, величающего себя царем, и алхимика, - которые и подсказывают ему, куда следует идти. Путешествие, предпринятое ради земного богатства, превращается в странствие ради обретения богатства внутреннего. Яркая, запоминающаяся и глубоко человечная история Сантьяго - это Вечный Завет о том, как сила мечты способна изменить жизнь, и о том, как важно прислушиваться к зову своего сердца."));
        list.add(new BooksModels(
                "Мёртвые души",
                "«Мёртвые ду́ши» — произведение писателя Николая Васильевича Гоголя, жанр которого сам автор обозначил как поэма.\n" +
                        "Авантюрист Чичиков скупает «мертвые души» — почивших крепостных, учтенных в качестве живых при последней ревизии. Помещики удивлены просьбами предприимчивого знакомца, но рады избавиться от обузы — ведь они платят налоги за учтенных в ревизских сказках крестьян как за живых. В дальнейшем Павел Иванович планирует совершить с купчими ряд махинаций и сказочно обогатиться. Но осуществиться его наполеоновским планам не суждено…"));
        list.add(new BooksModels(
                "Горе от ума",
                "«Горе от ума» — комедия в стихах А. С. Грибоедова — произведение, сделавшее своего создателя классиком русской литературы.\n" +
                        "Комедия «Горе от ума» — сатира на аристократическое московское общество первой половины XIX века — одна из вершин русской драматургии и поэзии; фактически завершила «комедию в стихах» как жанр. Афористический стиль способствовал тому, что она «разошлась на цитаты»."));
        adapter = new BookAdapter(list);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

        adapter.setOnBookClickListener(new OnBookClickListener() {
            @Override
            public void onItemClick(int position) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("position", list.get(position));
                BookFragment fragment = new BookFragment();
                fragment.setArguments(bundle);
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fr_container, fragment)
                        .addToBackStack(null).commit();
            }
        });
    }
}