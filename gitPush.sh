git add .

git commit -m "$1";

git push origin $2;

git checkout  master;

git merge $2;

git push origin master;
