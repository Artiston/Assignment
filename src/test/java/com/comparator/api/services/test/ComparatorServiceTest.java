/**
 * 
 */
package com.comparator.api.services.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.comparator.api.services.ComparatorService;

/**
 * This class contains all Unit Test of the comparatorService
 *
 */
class ComparatorServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	static int id;
	static String left,right;
	static ComparatorService service = new ComparatorService();
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		right = null;
		left = null;
		service = null;
	}

	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#compare(int)}.Happy path
	 */
	@Test
	void testCompare() {
		id = 1;
		left = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		right = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		service.setLeft(id, left);
		service.setRight(id, right);
		assertEquals("{\"result\":\"equals\"}",service.compare(id));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#compare(int)}. Invalid json
	 */
	@Test
	void testCompareNotValidJson() {
		id = 3;
		left = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		right = "[\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e90fcb08b351f234d\\\",\\r\\n    \\\"index\\\": 0,\\r\\n    \\\"guid\\\": \\\"da820847-5581-42fa-89ad-2a5b69766c26\\\",\\r\\n    \\\"isActive\\\": true,\\r\\n    \\\"balance\\\": \\\"$1,194.60\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 22,\\r\\n    \\\"eyeColor\\\": \\\"brown\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Roxie\\\",\\r\\n      \\\"last\\\": \\\"Carroll\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"GLUID\\\",\\r\\n    \\\"email\\\": \\\"roxie.carroll@gluid.biz\\\",\\r\\n    \\\"phone\\\": \\\"+1 (908) 527-2227\\\",\\r\\n    \\\"address\\\": \\\"908 Garnet Street, Sheatown, Hawaii, 823\\\",\\r\\n    \\\"about\\\": \\\"Id in officia incididunt enim occaecat dolore culpa reprehenderit laboris cupidatat. Culpa anim eu dolore laborum aliquip ex consequat mollit et. Elit eu commodo Lorem quis eiusmod eiusmod irure ea est esse sunt anim. Duis pariatur irure non non fugiat aute sint sunt tempor fugiat aliqua ea mollit proident. Quis est qui exercitation sit ex. Consectetur magna sit elit ut consequat esse exercitation nulla cillum occaecat dolor esse reprehenderit. Fugiat sunt nostrud incididunt nisi officia exercitation.\\\",\\r\\n    \\\"registered\\\": \\\"Tuesday, August 2, 2016 5:03 AM\\\",\\r\\n    \\\"latitude\\\": \\\"36.258086\\\",\\r\\n    \\\"longitude\\\": \\\"45.69811\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"est\\\",\\r\\n      \\\"aute\\\",\\r\\n      \\\"excepteur\\\",\\r\\n      \\\"veniam\\\",\\r\\n      \\\"aute\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Dorthy Alexander\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Compton Wyatt\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Hutchinson Santiago\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Roxie! You have 9 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"strawberry\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e03bb56610782a5ea\\\",\\r\\n    \\\"index\\\": 1,\\r\\n    \\\"guid\\\": \\\"80b62c5e-9b42-4897-a377-9266186c7ea0\\\",\\r\\n    \\\"isActive\\\": true,\\r\\n    \\\"balance\\\": \\\"$1,942.58\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 35,\\r\\n    \\\"eyeColor\\\": \\\"green\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Nixon\\\",\\r\\n      \\\"last\\\": \\\"Padilla\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"RADIANTIX\\\",\\r\\n    \\\"email\\\": \\\"nixon.padilla@radiantix.io\\\",\\r\\n    \\\"phone\\\": \\\"+1 (986) 457-2517\\\",\\r\\n    \\\"address\\\": \\\"170 Landis Court, Witmer, Virginia, 2095\\\",\\r\\n    \\\"about\\\": \\\"Consectetur magna duis minim dolore ullamco. Et do amet excepteur officia occaecat reprehenderit laborum non tempor cillum nostrud minim exercitation consectetur. Reprehenderit consequat amet aliqua esse non consectetur. Id anim velit reprehenderit proident tempor et quis. Elit ullamco proident officia aute ullamco esse laboris. Est proident aliqua ex laborum fugiat. Velit dolor culpa duis ea tempor commodo deserunt ut voluptate.\\\",\\r\\n    \\\"registered\\\": \\\"Wednesday, January 21, 2015 1:04 PM\\\",\\r\\n    \\\"latitude\\\": \\\"7.490538\\\",\\r\\n    \\\"longitude\\\": \\\"-149.147677\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"sunt\\\",\\r\\n      \\\"reprehenderit\\\",\\r\\n      \\\"amet\\\",\\r\\n      \\\"est\\\",\\r\\n      \\\"dolor\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Sargent Jones\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Karen Guerra\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Ramos Knapp\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Nixon! You have 6 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"banana\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216eea34946559afa793\\\",\\r\\n    \\\"index\\\": 2,\\r\\n    \\\"guid\\\": \\\"d238b423-9a65-4d37-ba70-7011c0e7ddf8\\\",\\r\\n    \\\"isActive\\\": true,\\r\\n    \\\"balance\\\": \\\"$3,250.32\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 33,\\r\\n    \\\"eyeColor\\\": \\\"green\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Nicole\\\",\\r\\n      \\\"last\\\": \\\"Blackwell\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"RODEOCEAN\\\",\\r\\n    \\\"email\\\": \\\"nicole.blackwell@rodeocean.name\\\",\\r\\n    \\\"phone\\\": \\\"+1 (894) 457-3932\\\",\\r\\n    \\\"address\\\": \\\"876 Montana Place, Shasta, Alaska, 3852\\\",\\r\\n    \\\"about\\\": \\\"Ex eu aliquip veniam Lorem ad sit sint voluptate magna laborum velit et. Occaecat irure quis mollit est excepteur labore sit nulla consectetur duis. Velit reprehenderit sit reprehenderit quis id Lorem occaecat pariatur cillum ad. Aute incididunt officia ea occaecat velit ad quis et commodo sint ullamco dolore. Culpa tempor ex mollit proident irure.\\\",\\r\\n    \\\"registered\\\": \\\"Thursday, November 8, 2018 2:33 AM\\\",\\r\\n    \\\"latitude\\\": \\\"-8.115375\\\",\\r\\n    \\\"longitude\\\": \\\"8.072975\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"deserunt\\\",\\r\\n      \\\"qui\\\",\\r\\n      \\\"anim\\\",\\r\\n      \\\"eu\\\",\\r\\n      \\\"tempor\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Jones Emerson\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Norman Mcdonald\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Sheree Rose\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Nicole! You have 10 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"banana\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e55d9432d69fa0695\\\",\\r\\n    \\\"index\\\": 3,\\r\\n    \\\"guid\\\": \\\"23cb9bee-1c96-4775-8cc2-92a4653ac025\\\",\\r\\n    \\\"isActive\\\": false,\\r\\n    \\\"balance\\\": \\\"$2,174.33\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 27,\\r\\n    \\\"eyeColor\\\": \\\"green\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Crane\\\",\\r\\n      \\\"last\\\": \\\"Lester\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"KOFFEE\\\",\\r\\n    \\\"email\\\": \\\"crane.lester@koffee.net\\\",\\r\\n    \\\"phone\\\": \\\"+1 (955) 522-3446\\\",\\r\\n    \\\"address\\\": \\\"209 Morton Street, Lowell, South Carolina, 8078\\\",\\r\\n    \\\"about\\\": \\\"Sint dolore incididunt duis enim nisi consequat commodo cillum consectetur enim. Nostrud culpa et et consequat ex magna. Excepteur et elit minim et exercitation dolor sint adipisicing nulla qui. Quis id non aliqua id commodo anim dolore et ullamco reprehenderit proident proident. Occaecat reprehenderit ex pariatur deserunt occaecat eiusmod fugiat commodo elit.\\\",\\r\\n    \\\"registered\\\": \\\"Tuesday, May 27, 2014 5:18 AM\\\",\\r\\n    \\\"latitude\\\": \\\"-13.069382\\\",\\r\\n    \\\"longitude\\\": \\\"-76.503209\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"aliqua\\\",\\r\\n      \\\"elit\\\",\\r\\n      \\\"anim\\\",\\r\\n      \\\"pariatur\\\",\\r\\n      \\\"commodo\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Naomi James\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Faulkner Fox\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Vazquez Best\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Crane! You have 9 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"apple\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e6d6354e28719553d\\\",\\r\\n    \\\"index\\\": 4,\\r\\n    \\\"guid\\\": \\\"dbb7157e-0776-4c1c-9603-a3a9f596f925\\\",\\r\\n    \\\"isActive\\\": true,\\r\\n    \\\"balance\\\": \\\"$2,648.16\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 34,\\r\\n    \\\"eyeColor\\\": \\\"blue\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Trevino\\\",\\r\\n      \\\"last\\\": \\\"Guy\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"PROXSOFT\\\",\\r\\n    \\\"email\\\": \\\"trevino.guy@proxsoft.tv\\\",\\r\\n    \\\"phone\\\": \\\"+1 (827) 589-3148\\\",\\r\\n    \\\"address\\\": \\\"936 Withers Street, Rockingham, West Virginia, 8934\\\",\\r\\n    \\\"about\\\": \\\"Ex adipisicing laboris id do do do. Sint elit occaecat sint ullamco labore incididunt ad occaecat id. Lorem est magna nostrud consectetur. Pariatur laborum enim amet anim laborum velit pariatur ex minim. Mollit incididunt officia elit labore in.\\\",\\r\\n    \\\"registered\\\": \\\"Wednesday, January 25, 2017 7:41 PM\\\",\\r\\n    \\\"latitude\\\": \\\"17.936694\\\",\\r\\n    \\\"longitude\\\": \\\"-108.55611\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"exercitation\\\",\\r\\n      \\\"sunt\\\",\\r\\n      \\\"ipsum\\\",\\r\\n      \\\"nisi\\\",\\r\\n      \\\"mollit\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Tasha Martinez\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Hampton Benton\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Cristina Kim\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Trevino! You have 5 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"strawberry\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e96c281f26c7048ff\\\",\\r\\n    \\\"index\\\": 5,\\r\\n    \\\"guid\\\": \\\"8c3e4346-9de3-4c86-8b3b-68f1a1a4a49b\\\",\\r\\n    \\\"isActive\\\": false,\\r\\n    \\\"balance\\\": \\\"$3,620.52\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 24,\\r\\n    \\\"eyeColor\\\": \\\"blue\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Paulette\\\",\\r\\n      \\\"last\\\": \\\"Hogan\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"TRIPSCH\\\",\\r\\n    \\\"email\\\": \\\"paulette.hogan@tripsch.biz\\\",\\r\\n    \\\"phone\\\": \\\"+1 (817) 546-2354\\\",\\r\\n    \\\"address\\\": \\\"904 Clarendon Road, Norvelt, Colorado, 662\\\",\\r\\n    \\\"about\\\": \\\"Laborum fugiat enim fugiat consectetur nisi non in est qui labore ea mollit nulla. Pariatur commodo in pariatur est labore laborum nisi officia. Incididunt tempor nostrud amet pariatur enim laboris anim amet. Labore est consectetur fugiat sit ipsum cillum ad. Velit occaecat minim deserunt Lorem occaecat occaecat cupidatat aliqua sint fugiat.\\\",\\r\\n    \\\"registered\\\": \\\"Thursday, October 30, 2014 10:13 PM\\\",\\r\\n    \\\"latitude\\\": \\\"-89.141296\\\",\\r\\n    \\\"longitude\\\": \\\"26.964041\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"sint\\\",\\r\\n      \\\"enim\\\",\\r\\n      \\\"irure\\\",\\r\\n      \\\"anim\\\",\\r\\n      \\\"anim\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Finch Buchanan\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Alston Hendrix\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Luisa Vazquez\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Paulette! You have 9 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"banana\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e01bae07ed1564f04\\\",\\r\\n    \\\"index\\\": 6,\\r\\n    \\\"guid\\\": \\\"4145f446-ce19-4892-a914-5dcaba8b577c\\\",\\r\\n    \\\"isActive\\\": false,\\r\\n    \\\"balance\\\": \\\"$1,589.05\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 28,\\r\\n    \\\"eyeColor\\\": \\\"brown\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Shelby\\\",\\r\\n      \\\"last\\\": \\\"Skinner\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"KONNECT\\\",\\r\\n    \\\"email\\\": \\\"shelby.skinner@konnect.org\\\",\\r\\n    \\\"phone\\\": \\\"+1 (834) 413-2356\\\",\\r\\n    \\\"address\\\": \\\"676 Cumberland Walk, Brownlee, New Mexico, 2747\\\",\\r\\n    \\\"about\\\": \\\"Qui id esse elit proident aliquip adipisicing sint aliquip Lorem labore dolor reprehenderit. Est ipsum laboris aliquip ipsum quis. Sit tempor irure laboris dolore. Deserunt aute commodo aliqua et in elit officia anim nisi sint qui.\\\",\\r\\n    \\\"registered\\\": \\\"Wednesday, April 10, 2019 12:43 AM\\\",\\r\\n    \\\"latitude\\\": \\\"-76.343908\\\",\\r\\n    \\\"longitude\\\": \\\"103.183698\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"in\\\",\\r\\n      \\\"tempor\\\",\\r\\n      \\\"ex\\\",\\r\\n      \\\"incididunt\\\",\\r\\n      \\\"nostrud\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Stafford Barton\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Coffey Randolph\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Muriel Nolan\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Shelby! You have 9 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"strawberry\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"_id\\\": \\\"5d07216e4776fadb0742f1bd\\\",\\r\\n    \\\"index\\\": 7,\\r\\n    \\\"guid\\\": \\\"250d6b43-398a-4a44-b727-436ab5590835\\\",\\r\\n    \\\"isActive\\\": true,\\r\\n    \\\"balance\\\": \\\"$1,401.27\\\",\\r\\n    \\\"picture\\\": \\\"http:\\/\\/placehold.it\\/32x32\\\",\\r\\n    \\\"age\\\": 31,\\r\\n    \\\"eyeColor\\\": \\\"brown\\\",\\r\\n    \\\"name\\\": {\\r\\n      \\\"first\\\": \\\"Leola\\\",\\r\\n      \\\"last\\\": \\\"Alvarado\\\"\\r\\n    },\\r\\n    \\\"company\\\": \\\"RECRITUBE\\\",\\r\\n    \\\"email\\\": \\\"leola.alvarado@recritube.co.uk\\\",\\r\\n    \\\"phone\\\": \\\"+1 (833) 480-2147\\\",\\r\\n    \\\"address\\\": \\\"369 Lott Place, Machias, Palau, 2526\\\",\\r\\n    \\\"about\\\": \\\"Non dolor esse aliqua fugiat eu cillum sunt incididunt in eiusmod in laborum. Mollit ipsum elit officia est consequat sunt ex enim cupidatat. Consequat dolore officia elit consectetur veniam ad laboris nostrud voluptate magna deserunt qui. Officia officia culpa anim reprehenderit eiusmod labore consequat consectetur. Esse tempor mollit non consectetur ut magna reprehenderit do elit reprehenderit id laborum. Sint ad eu veniam consequat irure eu et tempor voluptate do nulla do in do. Laborum tempor ullamco occaecat consectetur officia.\\\",\\r\\n    \\\"registered\\\": \\\"Friday, April 20, 2018 10:05 AM\\\",\\r\\n    \\\"latitude\\\": \\\"56.332069\\\",\\r\\n    \\\"longitude\\\": \\\"-35.831121\\\",\\r\\n    \\\"tags\\\": [\\r\\n      \\\"aliquip\\\",\\r\\n      \\\"duis\\\",\\r\\n      \\\"qui\\\",\\r\\n      \\\"id\\\",\\r\\n      \\\"ad\\\"\\r\\n    ],\\r\\n    \\\"range\\\": [\\r\\n      0,\\r\\n      1,\\r\\n      2,\\r\\n      3,\\r\\n      4,\\r\\n      5,\\r\\n      6,\\r\\n      7,\\r\\n      8,\\r\\n      9\\r\\n    ],\\r\\n    \\\"friends\\\": [\\r\\n      {\\r\\n        \\\"id\\\": 0,\\r\\n        \\\"name\\\": \\\"Bianca Hyde\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 1,\\r\\n        \\\"name\\\": \\\"Franklin Hickman\\\"\\r\\n      },\\r\\n      {\\r\\n        \\\"id\\\": 2,\\r\\n        \\\"name\\\": \\\"Peggy Ross\\\"\\r\\n      }\\r\\n    ],\\r\\n    \\\"greeting\\\": \\\"Hello, Leola! You have 9 unread messages.\\\",\\r\\n    \\\"favoriteFruit\\\": \\\"strawberry\\\"\\r\\n  }\\r\\n]";
		service.setLeft(id, left);
		service.setRight(id, right);
		assertEquals(null,service.compare(id));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#compare(int)}. Same size diff value
	 */
	@Test
	void testCompareSameSizeDiff() {
		id = 4;
		left = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		right = "{\"wins\":\"3\", \"losses\":\"0\", \"ties\": \"1\"}";
		service.setLeft(id, left);
		service.setRight(id, right);
		assertEquals("{\"wins\":\"diffInValue\"}",service.compare(id));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#compare(int)}.Not equals
	 */
	@Test
	void testCompareNotEquals() {
		id = 1;
		left = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		right = "{\"wins\":\"2\"}";
		service.setLeft(id, left);
		service.setRight(id, right);
		assertEquals("{\"result\":\"not equals\"}",service.compare(id));
	}

	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setLeft(int, java.lang.String)}. Happy path!
	 */
	@Test
	void testSetLeft() {
		id = 2;
		left = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		assertEquals("Success!!!",service.setLeft(id, left));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setLeft(int, java.lang.String)}. Empty json
	 */
	@Test
	void testSetLeftBlank() {
		id = 2;
		left = "";
		assertEquals("Empty parameter!!!",service.setLeft(id, left));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setLeft(int, java.lang.String)}. Null json
	 */
	@Test
	void testSetLeftNull() {
		id = 2;
		left = null;
		assertEquals("Empty parameter!!!",service.setLeft(id, left));
	}

	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setRight(int, java.lang.String)}. Happy path
	 */
	@Test
	void testSetRight() {
		id = 2;
		right = "{\"wins\":\"2\", \"losses\":\"0\", \"ties\": \"1\"}";
		assertEquals("Success!!!",service.setLeft(id, right));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setRight(int, java.lang.String)}. Empty json
	 */
	@Test
	void testSetRightBlank() {
		id = 2;
		right = "";
		assertEquals("Empty parameter!!!",service.setLeft(id, right));
	}
	
	/**
	 * Test method for {@link com.comparator.api.services.ComparatorService#setRight(int, java.lang.String)}. Null json
	 */
	@Test
	void testSetRightNull() {
		id = 2;
		right = null;
		assertEquals("Empty parameter!!!",service.setLeft(id, right));
	}

}
