db = db.getSiblingDB('job')

db.createUser({
    user: "job_user",
    pwd: "password",
    roles: [{
        role: "readWrite",
        db: 'job'
    }]
})

db.createCollection('job');

db.job.insertMany([
    {
        description: "senior jave developer",
        company: "apple",
        skills: ["java"],
        salary: 10000,
        isRemote: false
    },
    {
        description: "scrum master",
        company: "google",
        skills: ["agile", "jira"],
        salary: 150000,
        isRemote: true
    },
    {
        description: "techonology director",
        company: "microsoft",
        skills: ["management", "java"],
        salary: 180000,
        isRemote: true
    },
])