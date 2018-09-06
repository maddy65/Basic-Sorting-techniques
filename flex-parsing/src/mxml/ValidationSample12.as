
              import mx.validators.StringValidator;
              import mx.validators.PhoneNumberValidator;
              import mx.validators.EmailValidator;
              import mx.controls.Alert;
			  import mx.events.ValidationResultEvent;
			  import flash.external.ExternalInterface;
			  import flash.utils.describeType;
 
           public var nameValidator:StringValidator;
           public  var phoneValidator:PhoneNumberValidator;
           public  var emailValidator:EmailValidator;


		
			
			public function submitHandler():void
			{
				Alert.show("Welcome : " +nameInput.text +" to Adobe Flex.");
				textArea.text = describeType();
			}
			

