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
        <a class="navbar-brand" href="#">JEE - Receipes</a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">Accueil</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="/receipe/admin">Connexion</a></li>
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </nav>

  <div class="container">
    <!--search in the base -->
    <div class="jumbotron">
      <form>
        <span>Nom de recette</span> <input name="receipeName"/>
        <input name="action" value="searchByReceipeName" type="hidden"/>
        <input type="submit" value="Chercher"/>
      </form>

      <ul>
        <#list receipes as receipe>
        <li>${receipe_index} - ${receipe.getTitle()}</li>
        </#list>
      </ul>
    </div>
  </div>

  <div class="container">
    <div class="jumbotron">
      ${Clef}

      <table class="table">
        <tr>
          <th>Recettes</th>
          <th>Temps de Cuisson</th>
          <th>Temps de Préparation</th>
          <th>Principaux Ingrédients</th>
        </tr>

        <#list receipesList as recipe>
        <tr>
          <td>
            ${recipe.getTitle()}
          </td>
          <td>
            ${recipe.getCookTime()}
          </td>
          <td>
            ${recipe.getPreparationTime()}
          </td>
          <td>
            ${recipe.toString()}
          </td>
        </tr>
        </#list>

      </table>
    </div>
  </div>

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="js/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.min.js"></script>
</body>
</html>
