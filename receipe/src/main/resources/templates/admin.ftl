<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>${title}</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- my css -->
  <link href="css/master.css" rel="stylesheet">
</head>

<body>
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <a class="navbar-brand" href="/receipe/main">JEE - Receipes - Admin</a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
          <li class="active"><a href="/receipe/main">Accueil</a></li>
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </nav>

  <div class="container">
    <div class="jumbotron">
      <form action="admin/init">
        <span>Remplir la base</span>
        <input name="submit" type="submit" value="Remplir" />
      </form>
    </div>
  </div>

  <div class="container">
    <div class="jumbotron">
      <form>
        <span>Ajouter Recette</span>

        <input name="receipeName"/>
        <input name="action" value="addReceipe" type="hidden"/>
        <input name="submit" type="submit" value="Ajouter"/>
      </form>
    </div>
  </div>

  <div class="container">
    <div class="jumbotron">
      <form>
        <span>Suppression Recette</span>
        <input name="submit" type="submit" value="Supprimer"/>
      </form>
    </div>
  </div>

  <div class="container">
    <div class="jumbotron">
      <form>
        <span>Ajout Ingrédient</span>
        <input name="submit" type="submit" value="Supprimer"/>
      </form>
    </div>
  </div>


  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="js/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.min.js"></script>
</body>
</html>
