<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title}</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
  <div class="page-header">
    <h1>Java EE - Recettes de cuisine </h1>
  </div>


<div>
Template client à écrire (mode non connecté, consultation uniquement)

Exemple valeur :
${Clef}

Exemple liste
    <table class="table">
        <tr>
            <th>Colonne</th>
         </tr>

         <#list elements as elem>
          <tr><td>${elem.getTitle()} </td><tr>
         </#list>

             </table>
</div>


<div>
 <form>
 <span>Nom de recette</span> <input name="receipeName"/>
 <input name="action" value="searchByReceipeName" type="hidden"/>
 <input type="submit" value="Chercher"/>
 </form>
</div>

<ul>
<#list receipes as receipe>
<li>${receipe_index} - ${receipe.getTitle()}</li>
</#list>
</ul>


Test liste


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
