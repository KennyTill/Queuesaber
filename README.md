# Queuesaber

#### What is it?
Queuesaber is a web application using Java 10 that allows users to search for custom tracks already installed in Beat 
Saber.

#### But you can already do that!
This is a file discovery service, and manual queue management system. What that actually means, is it allows players to
look at what songs you have without playing.

#### What was that about queues?
So imagine for a second that you have Beat Saber. Imagine you have 6 people who wanna play. Now imagine you have 
something like... 4500 songs installed. How long is it going to take a player to pick a song? Let alone remember what 
they wanted to play. This lets you manage a turn order, and serves as a friendly reminder to the players about what 
songs they had picked for their turn. ~~At this point in time, there is no plugin integration (though that would be rad
to add later), and is manually managed through a web app.~~ *update* Plugin under development will support being able to pick queued songs from a list.

#### Sounds cool but how do I use it?
Right now it is being built. ~~There's currently an overlay that was quickly hacked together that will be pulled in, and 
displayed over the game screen (not in the VR headset). It will show the current player, the songs the picked, and the 
upcoming player list.~~ *Update* This information may be dropped in favor of in game tracking instead, and possibly feedback through the web app.

#### Getting it set up
This project scans the custom songs directory specified, and looks for the info.json file for each track. You will need
to specify the location for that folder. 
