# Directories and their content

- `part0` contains the base code after completing the main part of the problem.
- `part1` contains the code after completing the first expansion of the problem. The differences between `part0` and `part1` are:
  - In `Match`: the new methods `getHomeTeamName` and `getAwayTeamName` and their usage in `printDetails`.
- `part2` contains the code after completing the second expansion of the problem. The differences between `part1` and `part2` are:
  - In `Player`: the new method `printDetails`.
  - In `Match`: the replacement of `homeGoals` and `awayGoals` with `homeScorers` and `awayScorers` in both name and type.
    - Respective changes in the class constructor and the getters, and the replacement of the previous setters with new `add*` methods.
    - Finally, the changes in `printDetails` and the addition of `printScorers`.
  - In `Main`: the addition of `Player` variables and replacement of old setters with new `add*` methods.
- `part3` contains the code after completing the third expansion of the problem. The differences between `part2` and `part3` are:
  - In `League`: the new method `printOrdered`.
  - In `Main`: the addition of reading input from console and `readValidBoolean`.
- `part4` contains the code after completing the fourth expansion of the problem. The differences between `part3` and `part4` are:
  - In `Match`: addition of `if contains` checks in the methods `addHomeScorer` and `addAwayScorer`.
