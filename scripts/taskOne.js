/*
Task, due tomorrrow
create a simple JS object that stores names of 4 football teams 
for each football team you need country, coach, ranking, trophies
the program must display all the teams and the total worth of all 4 teams
within the team object also add a list of players

1. object with four teams
2. each team object has attributes i.e country, coach, ranking, trophies, players(list)
3. display all teams and their total worth
*/
let fourTeams = {
    barcelona:{
        country: 'Spain',
        coach: 'Hansi Flick',
        ranking: 1,
        trophies: 132,
        players:[
            'Lewandowski','Martinez','Christensen','Olmo','Pena','Jong','Torres','Kounde','Raphinha','Garcia','Araujo'
        ],
        worth:4760000000
    },
    realMadrid:{
        country: 'Spain',
        coach: 'Carlo Ancelotti',
        ranking: 3,
        trophies: 128,
        players:[
            'Courtois','Alaba','Rüdiger','Modric','Valverde','Vinicius','Mbappé','Bellingham','Rodrygo','Camavinga'
        ],
        worth:6600000000
    },
    arsenal:{
        country: 'England',
        coach: 'Mikel Arteta',
        ranking: 3,
        trophies: 48,
        players:[
            'Ramsdale','White','Gabriel','Saliba','Zinchenko','Partey','Odegaard','Saka','Martinelli','Jesus','Nketiah'
        ],
        worth:2300000000
    },
    liverPool:{
        country: 'England',
        coach: 'Arne Slot',
        ranking: 1,
        trophies: 51,
        players:[
            'Alisson','Alexander-Arnold','Van Dijk','Robertson','Fabinho','Henderson','Salah','Mané','Firmino','Jota','Díaz'
        ],
        worth:3600000000
    }
}
console.log(fourTeams);
console.log(fourTeams.arsenal.worth + fourTeams.barcelona.worth + fourTeams.liverPool.worth + fourTeams.realMadrid.worth);