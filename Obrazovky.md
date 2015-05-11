Aplikace bude obsahovat 5 základních obrazovek:
  * Přihlášení
  * Registrace, profil a jeho úprava
  * Seznam jízd
  * Detail jízdy
  * Zadání nové cesty jako řidič
  * + Seznam upozornění (možná nebude v první verzi)

# Přihlášení #
> Jednoduchá obrazovka umožňující přihlášení do systému.

# Registrace #
> Obrazovka umožňující registraci nového uživatele. Pokud je uživatel přihlášen, bude možné pomocí této obrazovky měnit svůj profil.

> ## Obsah obrazovky ##
> > Zde budou již minule dohodnuté položky (viz. jeden z předchozích dokumentů)

# Seznam jízd #

> Jedná se o obrazovku, jejíž hlavním prvkem je tabulka jízd. Obrazovka umožňuje filtrovat tabulku jízd podle zvolených kritérií. Je umožněno přepínat obsah obrazovky pomocí záložek.

> ## Záložky obrazovky ##
> Tabulka by měla být společná pro všechny záložky. Je tedy otázkou, zda-li záložky nezaměnit za jiný přepínač.
    * Vyhledání cesty dle filtru
    * Aktivní cesty (jako pasažér i jako řidič) - jedná se o cesty, na které jsem se již přihlásil (schválené i neschválené) nebo jsem je vytvořil

> ## Položky filtru ##
    * Odkud
    * Kam
    * Max. teoretická cena za osobu (při plném obsazení)
    * Času odjezdu (rozsah od-do)
    * Max. čas příjezdu
    * Počet míst (které si chci zarezervovat)
    * Min. hodnocení řidiče

> ## Položky tabulky ##
    * Čas odjezdu
    * Čas příjezdu
    * Cena za osobu při plném autě
    * Celková cena
    * Volná místa / Místa celkem
    * Hodnocení řidiče
    * Detail (odkaz)

  * Otázkou zůstává zda-li bude tento grid použit i pro aktivní cesty - u pasažéra asi ano, ale je to nutné u řidiče?
  * Pokud při vyhledávání cesty vyhledávač nic nenajde, zeptá se uživatele, zda-li chce zaregistrovat nový požadavek na cestu, pokud zvolí ano, vloží se požadavek dle vyplněných hodnot

# Detail jízdy #
> Na tuto obrazovku se přechází ze seznamu jízd, kliknutím na detail jízdy v tabulce jízd. Obrazovka obsahuje kompletní detaily týkající se dané jízdy. Obrazovka je opět rozdělena na několik záložek.

> ## Záložky obrazovky ##
    * Trasa cesty
      * Obsahuje všechny položky z tabulky
    * Detail řidiče
      * Informace o řidiči
      * Detail hodnocení řidiče včetně komentářů hodnocení (rozkliknutí průměrného hodnocení - nepřepínat obrazovku!)
    * Mapa??? - (možná vypadne v první verzi)
    * Pasažéři (přístupné pouze pokud jsem zaregistroval cestu jako řidič)
      * Informace o uživateli, jeho hodnocení
      * Možnost potvrzování/odmítání potenciálních pasažérů

> Je nutné někam umístit tlačítka: "Chci jet" / "Už nechci"(pokud se jedná o již zaregistrovanou cestu)

# Zadání nové cesty #
> Tato obrazovka by měla spustit wizard, který uživatele provede zadáním nové cesty.

> ## Wizard ##
    * Zadání parametrů cesty (viz. předešlý dokument)
    * Zadání trasy cesty (dynamické přidávání dalších zastávek)
      * Místo
      * Čas
    * Zobrazit počet zájemců o tuto cestu + ???Zobrazení žádostí, které korespondují s mnou zadanou cestou (možná vypustit v první verzi)??? + možnost odeslat pozvánky (alerty)

# Seznam upozornění #
> Tato obrazovka by měla zobrazovat všechny doposud přijatá upozornění. Možná nebude nutná v první verzi.