// --------------------------------------------
// handling good choices with event handlers too
// See http://www.tropo.com for more info
// --------------------------------------------

answer();

ask( "Hi. For sales, just say sales or press 1. For support, say support or press 2.", 
			[ 
			  choices:"sales( 1, sales), support( 2, support)", repeat:3,
			  onBadChoice: { say("I'm sorry, I didn't understand what you said.") },
			  onTimeout: { say("I'm sorry.  I didn't hear anything.") },
			  onChoice: {event->
				if (event.value=='sales')
				{
					say( "Ok, let me transfer you to sales." );
					transfer( "14129272358");
				}
				if (event.value=='support')
				{
					say( "Sure, let me get support. Please hold." );
					transfer( "14129272341");
				}			
			  }			
			] );
			


