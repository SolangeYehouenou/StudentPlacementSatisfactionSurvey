<?php

$Name = $_POST['Name'];
$Email = $_POST['Email'];
$Age = $_POST['Age'];
$jobLevel = $_POST['jobLevel'];
$question1 = $_POST['question1'];
$question2 = $_POST['question2'];
$question3 = $_POST['question3'];
$question4 = $_POST['question4'];
$question5 = $_POST['question5'];
$question6 = $_POST['question6'];
$Location = $_POST['Location'];
$background = $_POST['background'];
$gender = $_POST['gender'];


//Database Connection
$conn = new mysqli('localhost', 'root', '', 'student');
if($conn->connect_error){
    die('Connection Failed : ' .$conn->connect_error);
}else{
    $stmt = $conn->prepare("INSERT INTO survey(Name, Email, Age, jobLevel, question1,
        question2, question3, question4, question5, question6, Location, background, gender)
        VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    $stmt->bind_param("ssissssssssss", $Name, $Email, $Age, $jobLevel, $question1, $question2, $question3, $question4,
        $question5, $question6, $Location, $background, $gender);
    $stmt->execute();
    echo "Thanks so much for giving us feedback!";
    $stmt->close();
    $conn->close();
    
}

?>