/*
Navicat MySQL Data Transfer

Source Server         : linh
Source Server Version : 50729
Source Host           : 101.200.58.102:3306
Source Database       : cms_movie

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-04-08 15:08:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cms_category
-- ----------------------------
DROP TABLE IF EXISTS `cms_category`;
CREATE TABLE `cms_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `no` int(11) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_category_category` (`parent_id`),
  CONSTRAINT `fk_category_category` FOREIGN KEY (`parent_id`) REFERENCES `cms_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_category
-- ----------------------------
INSERT INTO `cms_category` VALUES ('1', '科幻', '科幻悬疑', '1', null);
INSERT INTO `cms_category` VALUES ('2', '喜剧', '喜剧搞笑', '2', null);
INSERT INTO `cms_category` VALUES ('3', '战争', '战争谍报', '3', null);
INSERT INTO `cms_category` VALUES ('4', '剧情', '剧情叙事', '4', null);
INSERT INTO `cms_category` VALUES ('5', '动作', '动作武打', '5', null);
INSERT INTO `cms_category` VALUES ('6', '爱情', '爱情伦理', '6', null);

-- ----------------------------
-- Table structure for cms_comment
-- ----------------------------
DROP TABLE IF EXISTS `cms_comment`;
CREATE TABLE `cms_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `comment_time` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `movie_id` bigint(20) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comment_user` (`user_id`),
  KEY `fk_comment_article` (`movie_id`),
  KEY `fk_comment_comment` (`parent_id`),
  CONSTRAINT `fk_comment_article` FOREIGN KEY (`movie_id`) REFERENCES `cms_movie` (`id`),
  CONSTRAINT `fk_comment_comment` FOREIGN KEY (`parent_id`) REFERENCES `cms_comment` (`id`),
  CONSTRAINT `fk_comment_user` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_comment
-- ----------------------------
INSERT INTO `cms_comment` VALUES ('1', '看完没人起立鼓掌，因为全跪着', null, '已审核', '1', '1', null);
INSERT INTO `cms_comment` VALUES ('2', '诺兰说：如果我活得够长 那么豆瓣TOP250就被我承包了', null, null, '1', '1', null);
INSERT INTO `cms_comment` VALUES ('3', '太壮阔了，无以言表！40\'渐入佳境，80\'叹为观止，120\'泪流满面，160\'恍如隔世…不曾如此贴近浩瀚星空，被它环抱；不曾如此触摸生命之弦，遁入五维幻境。瑕不掩瑜的科幻神作，刷新视觉的IMAX体验，观影前撒好尿，准备接受近三小时的泪腺洗礼。“爱是一种力量，让我们超越时空感知它的存在”', null, null, '1', '1', null);
INSERT INTO `cms_comment` VALUES ('4', '带着满脸的眼泪和鼻涕泡儿看完的', null, null, '1', '2', null);
INSERT INTO `cms_comment` VALUES ('5', '巨人的神话，一个黑人耶稣诞生在美国，会出现怎样的结局呢？感叹金的奇思妙想，也隐约读出汉克斯对于“不死”所抱的悲凉。', null, null, '1', '2', null);
INSERT INTO `cms_comment` VALUES ('6', '“我累了，不想活了，真的，我不想再像孤雁一样，我不想再过没有朋友的日子，我希望有人能告诉我该何去何从，我不想再看到丑陋的人性，我不想在每日承担全世界的痛苦。”讲的是耶稣么？十字架变成了电椅。', null, null, '1', '2', null);
INSERT INTO `cms_comment` VALUES ('7', '为了我家的Ewan。。。5颗星。。。帅阿。。。', null, null, '1', '3', null);
INSERT INTO `cms_comment` VALUES ('8', '岛上未来感十足 大陆上感觉除了飞行器外基本上和现在没什么区别 很迈克尔贝的爆炸 卡司加分 XBOX的广告则很无厘头 那年代还有人玩这老古董么', null, null, '1', '3', null);
INSERT INTO `cms_comment` VALUES ('9', '现在能让我不快进的都打四星，还挺精彩的，俩主演是大众喜欢的美人，动作场面给力，题材是我感兴趣的未来医学，我从小就梦想着必要时体验一把人体冷冻技术。片中的克隆计划只要500万美元，简直太便宜了，国内目前可以用猪的器官来做移植。看电影还是瘫沙发上最安逸，所以我很久没看冷门片了。', null, null, '1', '3', null);
INSERT INTO `cms_comment` VALUES ('10', '受这些苦必定是为了些值得的东西 ', null, null, '1', '4', null);
INSERT INTO `cms_comment` VALUES ('11', '在我们肉眼仅能看到的现代文明背后，存在太多所谓传统愚昧的种种制度，恶习。足以震颤我们每个人的心。女主角真的很漂亮。', null, null, '1', '4', null);
INSERT INTO `cms_comment` VALUES ('12', '这部电影揭露了这世界上存在的一些黑暗角落，对女性的歧视与虐待，为这些受到不公平对待的女性祈祷，希望她们的处境越来越好。', null, null, '1', '4', null);
INSERT INTO `cms_comment` VALUES ('13', '论同性婚姻合法化的重要性，要是二奶合法继承了，还有他王多鱼什么事', null, null, '1', '5', null);
INSERT INTO `cms_comment` VALUES ('14', '对我而言，最大的看点就是看男主肆无忌惮的挥霍财产，给穷屌丝我一种起点爽文的生理快感，但这个快感很快随着行为的重复而削弱。而在该进入到正经的煽情与讽刺环节时，垮了，球场戏尬到我将头扭向一边。剧本其实有出彩的点，但导演所选取的展现方过于浮夸，这种浮夸在笑点上是有用的，但却让电影天马行空到有些不可理喻，难以共情。夏洛特烦恼也不写实，也舞台化，但至少还有那接地气的一碗面。西虹市只有钱，飘满天的钱，但钱多了，也就不值钱了。', null, null, '1', '5', null);
INSERT INTO `cms_comment` VALUES ('15', '作为一个笑点还比较高的人，一度笑崩溃了。亮点很多，惊喜密集。而难得的是，阐述了喜剧比较高级的力量，对当今社会做了不同角度和程度的讽刺。', null, null, '1', '5', null);
INSERT INTO `cms_comment` VALUES ('16', '我开始想要过得快乐，睡在床上，有牵挂', null, null, '1', '6', null);
INSERT INTO `cms_comment` VALUES ('17', '萝莉有颗御姐心，正太有个大叔身——邪恶又天真、残酷又温柔，多完美~', null, null, '1', '6', null);
INSERT INTO `cms_comment` VALUES ('18', '里昂只有一颗盆栽，不善言辞，爱喝牛奶。他不像，却真正是一个杀手。玛蒂达的到来，是包袱，也给里昂带来了生机。不过这种设定，注定是悲剧收场。里昂死后，玛蒂达将他盆栽的种子落地生根，里昂终于不再每日拿着手枪在椅子上不安地入睡，他落地了。娜塔莉波特曼太灵了，玛蒂达是如此特别。', null, null, '1', '6', null);

-- ----------------------------
-- Table structure for cms_logs
-- ----------------------------
DROP TABLE IF EXISTS `cms_logs`;
CREATE TABLE `cms_logs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` text,
  `action_time` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id_fk` (`user_id`) USING BTREE,
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of cms_logs
-- ----------------------------
INSERT INTO `cms_logs` VALUES ('1', '添加对日志权限的控制', '2020-04-08 13:45:09', '1', '添加权限');
INSERT INTO `cms_logs` VALUES ('2', '优化了主页内容中的链接地址', '2020-04-08 13:45:09', '1', '优化页面');
INSERT INTO `cms_logs` VALUES ('3', '设定最大延迟时间', '2020-04-07 15:42:42', '1', '优化跳转');
INSERT INTO `cms_logs` VALUES ('4', '针对报错统一消息提示', '2020-04-08 13:45:09', '1', '优化提示');
INSERT INTO `cms_logs` VALUES ('5', '添加了teacher角色', '2020-04-07 15:42:42', '1', '添加角色');

-- ----------------------------
-- Table structure for cms_movie
-- ----------------------------
DROP TABLE IF EXISTS `cms_movie`;
CREATE TABLE `cms_movie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `source` text,
  `publish_time` varchar(255) DEFAULT NULL,
  `read_times` bigint(20) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `thump_up` bigint(255) DEFAULT NULL,
  `thump_down` bigint(255) DEFAULT NULL,
  `author_id` bigint(20) DEFAULT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_article_category` (`category_id`),
  KEY `fk_article_user` (`author_id`),
  CONSTRAINT `fk_movie_category` FOREIGN KEY (`category_id`) REFERENCES `cms_category` (`id`),
  CONSTRAINT `fk_movie_user` FOREIGN KEY (`author_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_movie
-- ----------------------------
INSERT INTO `cms_movie` VALUES ('1', '星际穿越', '《星际穿越》（Interstellar）是克里斯托弗·诺兰执导的一部原创科幻冒险电影，由马修·麦康纳、安妮·海瑟薇、杰西卡·查斯坦及迈克尔·凯恩主演，基于知名理论物理学家，诺贝尔物理学奖得主基普·索恩的黑洞理论经过合理演化之后，加入人物和相关情节改编而成。影片由派拉蒙、华纳和传奇影业联合制作，派拉蒙负责北美发行，华纳负责海外发行，定于2014年11月7日在北美公映 。\r\n《星际穿越》主要讲述了一队探险家利用他们针对虫洞的新发现，超越人类对于太空旅行的极限，从而开始在广袤的宇宙中进行星际航行的故事 。\r\n2015年3月，《星际穿越》在第41届美国科幻恐怖电影奖土星奖获得了最佳科幻电影、最佳导演、最佳男女主角在内的10项提名。', 'http://101.200.58.102:8080/manager/images/xjcy.png', '2020-03-18 12:30:30', '99', '已审核', null, null, '1', '1');
INSERT INTO `cms_movie` VALUES ('2', '绿里奇迹', '\r\n《绿里奇迹》是华纳兄弟影片公司出品的悬疑电影，由弗兰克·德拉邦特执导，汤姆·汉克斯、大卫·摩斯、迈克·克拉克·邓肯等主演，于1999年12月6日上映 。\r\n影片改编自史蒂芬·金的小说《绿里奇迹》，讲述了二十世纪，保罗在老人院回忆起在当狱长时，高个子黑人约翰·科菲因被误判来到死牢后发生的超自然的事件。\r\n', 'http://101.200.58.102:8080/manager/images/llqj.png', '2020-03-18 09:21:25', '153', '已审核', null, null, '1', '4');
INSERT INTO `cms_movie` VALUES ('3', '逃离克隆岛', '\r\n影片《逃出克隆岛》是2005年梦工厂出品的一部动作电影，由美国导演迈克尔·贝执导的一部科幻电影，伊万·麦克戈雷格和斯嘉丽·约翰逊等联袂出演，影片于2005年7月22日在美国上映。\r\n影片的故事发生于21世纪中期，讲述了男青年林肯·6E生活在一个貌似乌托邦的社区里。梦想被选中成为“神秘岛”的访客，因为据说那个岛是这个星球上惟一没有被污染过的一片净土。但是不久后的一个意外让林肯惊觉：他其实是“神秘岛”居民们的克隆人，他的存在只是为了给他的“原型”提供各种更换用的身体零件。最后克隆人逃出囚笼、寻求真相的故事。', 'http://101.200.58.102:8080/manager/images/tckld.png', '2020-03-19 14:47:20', '169', '已审核', '0', '0', '1', '1');
INSERT INTO `cms_movie` VALUES ('4', '沙漠之花', '《沙漠之花》是雪瑞·霍尔曼执导的剧情片，制片于英国，由莉亚·科贝德、莎莉·霍金斯等主演。\r\n该片根据索马里黑人模特华莉丝·迪里的自传畅销书改编。讲述了华莉丝从索马里沙漠中走出到成为世界顶级名模的故事，于2009年在英国上映。 [1\r\n华莉丝·迪里（莉亚·科贝德饰）出生在荒凉的索马里沙漠，三岁时被迫接受了惨无人道的女性割礼，十二岁时为了五头骆驼被父亲嫁给六十岁的老叟，赤脚逃婚在沙漠中差点丢了性命。后到伦敦被好心的玛丽莲（莎莉·霍金斯饰）收留，在打工的餐厅里遇到著名摄影师唐纳森（蒂莫西·斯波饰），最终成为世界顶级名模，并投身于妇女解放事业。', 'http://101.200.58.102:8080/manager/images/smzh.png', '2020-03-19 14:48:55', '87', '已审核', '0', '0', '1', '4');
INSERT INTO `cms_movie` VALUES ('5', '西虹市首富', '《西虹市首富》是由闫非、彭大魔编剧兼执导，沈腾、宋芸桦、张一鸣、常远、张晨光、魏翔等主演的喜剧片，于2018年7月27日在中国大陆上映。 该片讲述了混迹于丙级业余足球队的守门员王多鱼，因比赛失利被开除离队，却因继承二爷遗产而获得大笔财富，由此引发一系列令人哭笑不得的事件。', 'http://101.200.58.102:8080/manager/images/xhssf.png', '2020-03-19 14:49:39', '89', '已审核', '0', '0', '1', '2');
INSERT INTO `cms_movie` VALUES ('6', '这个杀手不太冷', '《这个杀手不太冷》是由吕克·贝松编剧并执导，让·雷诺、加里·奥德曼、娜塔丽·波特曼主演的动作片，该片于1994年9月14日在法国上映。\r\n该片讲述了一名职业杀手莱昂无意间搭救了一个全家被杀害的小女孩玛蒂尔达，他和小女孩互生情愫，最后他为了救玛蒂尔达而身亡的故事。            \r\n\r\n纽约贫民区住着一个意大利人，名叫莱昂（让·雷诺饰），他是一名职业杀手。一天，邻居家小姑娘玛蒂尔达（娜塔莉·波特曼饰）敲开了他的房门，要求在他这里暂避杀身之祸。原来，邻居家的主人是警察的眼线，因贪污了一小包毒品而遭到恶警史丹菲尔（加里·奥德曼饰）剿灭全家的惩罚。玛蒂尔达得到莱昂的救助，开始帮莱昂管理家务并教其识字，莱昂则教女孩用枪，两人相处融洽。并且在他们之间还产生了一种奇妙的化学反应：爱情。女孩跟踪史丹菲尔，贸然去报仇，不小心被抓。莱昂及时赶到，将女孩救回。他们再次搬家，但女孩还是落入史丹菲尔之手。莱昂撂倒一片警察，再次救出女孩并让她通过通风管道逃生，并嘱咐她去把他积攒的钱取出来。莱昂则化装成警察试图混出包围圈，但被狡猾的史丹菲尔识破，不得已引爆了身上的炸弹。', 'http://101.200.58.102:8080/manager/images/zgssbtl.png', '2020-03-20 15:16:32', '45', '已审核', null, null, '1', '6');

-- ----------------------------
-- Table structure for cms_privilege
-- ----------------------------
DROP TABLE IF EXISTS `cms_privilege`;
CREATE TABLE `cms_privilege` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `route` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_privilege_privilege` (`parent_id`),
  CONSTRAINT `fk_privilege_privilege` FOREIGN KEY (`parent_id`) REFERENCES `cms_privilege` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_privilege
-- ----------------------------
INSERT INTO `cms_privilege` VALUES ('1', '栏目管理', '', '/category/*', 'menu', '', null);
INSERT INTO `cms_privilege` VALUES ('2', '批量删除', '', '/category/batchDelete', 'method', '', '1');
INSERT INTO `cms_privilege` VALUES ('3', '通过id删除', null, '/category/deleteById', 'method', null, '1');
INSERT INTO `cms_privilege` VALUES ('4', '查询所有栏目', null, '/category/findAll', 'method', null, '1');
INSERT INTO `cms_privilege` VALUES ('5', '评论管理', null, '/comment/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('6', '通过id删除', '', '/comment/deleteById', 'method', '', '5');
INSERT INTO `cms_privilege` VALUES ('7', '查询所有评论', '', '/comment/findAll', 'method', '', '5');
INSERT INTO `cms_privilege` VALUES ('8', '通过id查询', null, '/comment/findById', 'method', null, '5');
INSERT INTO `cms_privilege` VALUES ('9', '保存或修改', null, '/comment/saveOrUpdate', 'method', null, '5');
INSERT INTO `cms_privilege` VALUES ('10', '日志管理', null, '/logs/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('11', '级联查询日志', null, '/logs/cascadeFindAll', 'method', null, '10');
INSERT INTO `cms_privilege` VALUES ('12', ' 查询所有', null, '/logs/findAll', 'method', null, '10');
INSERT INTO `cms_privilege` VALUES ('13', '通过id查询日志', null, '/logs/findById', 'method', null, '10');
INSERT INTO `cms_privilege` VALUES ('14', '保存或修改', null, '/logs/saveOrUpdate', 'method', null, '10');
INSERT INTO `cms_privilege` VALUES ('15', '电影列表', null, '/movie/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('16', '级联查询所有', null, '/movie/cascadeFindAll', 'method', null, '15');
INSERT INTO `cms_privilege` VALUES ('17', '通过id删除', null, '/movie/deleteById', 'method', null, '15');
INSERT INTO `cms_privilege` VALUES ('18', '查询所有电影', null, '/movie/findAll', 'method', null, '15');
INSERT INTO `cms_privilege` VALUES ('19', '通过id查询', null, '/movie/findById', 'method', null, '15');
INSERT INTO `cms_privilege` VALUES ('20', '保存或修改', null, '/movie/saveOrUpdate', 'method', null, '15');
INSERT INTO `cms_privilege` VALUES ('21', '权限管理', null, '/privilege/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('22', '查询所有', null, '/privilege/findAll', 'method', null, '21');
INSERT INTO `cms_privilege` VALUES ('23', '通过父id查询权限', null, '/privilege/findByParentId', 'method', null, '21');
INSERT INTO `cms_privilege` VALUES ('24', '查询权限树', null, '/privilege/findPrivilegeTree', 'method', null, '21');
INSERT INTO `cms_privilege` VALUES ('25', '保存或修改', null, '/privilege/saveOrUpdate', 'method', null, '21');
INSERT INTO `cms_privilege` VALUES ('26', '角色权限表', null, '/role_privilege/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('27', '查询所有', null, '/role_privilege/findAll', 'method', null, '26');
INSERT INTO `cms_privilege` VALUES ('28', '通过id查询', null, '/role_privilege/findById', 'method', null, '26');
INSERT INTO `cms_privilege` VALUES ('29', '保存或修改', null, '/role_privilege/saveOrUpdate', 'method', null, '26');
INSERT INTO `cms_privilege` VALUES ('35', '角色管理', null, '/role/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('36', '为角色授权', null, '/role/authorization', 'method', null, '35');
INSERT INTO `cms_privilege` VALUES ('37', '查询所有', null, '/role/cascadePrivilegeFindAll', 'method', null, '35');
INSERT INTO `cms_privilege` VALUES ('38', '通过id删除', null, '/role/deleteById', 'method', null, '35');
INSERT INTO `cms_privilege` VALUES ('39', '查询所有', null, '/role/findAll', 'method', null, '35');
INSERT INTO `cms_privilege` VALUES ('40', '保存或修改', null, '/role/saveOrUpdate', 'method', null, '35');
INSERT INTO `cms_privilege` VALUES ('41', '用户角色表', null, '/user_role/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('42', '查询所有', null, '/user_role/findAll', 'method', null, '41');
INSERT INTO `cms_privilege` VALUES ('43', '通过id查询', null, '/user_role/findById', 'method', null, '41');
INSERT INTO `cms_privilege` VALUES ('44', '通过用户id查询', null, '/user_role/findByUserId', 'method', null, '41');
INSERT INTO `cms_privilege` VALUES ('45', '保存或修改', null, '/user_role/saveOrUpdate', 'method', null, '41');
INSERT INTO `cms_privilege` VALUES ('46', '用户列表', null, '/user/*', 'menu', null, null);
INSERT INTO `cms_privilege` VALUES ('47', '级联查询所有', null, '/user/cascadeRoleFindAll', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('48', '通过id删除', null, '/user/deleteById', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('49', '查询所有', null, '/user/findAll', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('50', '通过id查询', null, '/user/findById', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('51', '通过token获取信息', null, '/user/info', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('52', '登陆', null, '/user/login', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('53', '退出', null, '/user/logout', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('54', '保存或修改', null, '/user/saveOrUpdate', 'method', null, '46');
INSERT INTO `cms_privilege` VALUES ('55', '设置角色', null, '/user/setRoles', 'method', null, '46');

-- ----------------------------
-- Table structure for cms_role
-- ----------------------------
DROP TABLE IF EXISTS `cms_role`;
CREATE TABLE `cms_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_role
-- ----------------------------
INSERT INTO `cms_role` VALUES ('1', 'admin');
INSERT INTO `cms_role` VALUES ('2', 'editor');
INSERT INTO `cms_role` VALUES ('3', 'teacher');

-- ----------------------------
-- Table structure for cms_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `cms_role_privilege`;
CREATE TABLE `cms_role_privilege` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `privilege_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_role_privilege_role` (`role_id`),
  KEY `fk_role_privilege_privilege` (`privilege_id`),
  CONSTRAINT `fk_role_privilege_privilege` FOREIGN KEY (`privilege_id`) REFERENCES `cms_privilege` (`id`),
  CONSTRAINT `fk_role_privilege_role` FOREIGN KEY (`role_id`) REFERENCES `cms_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_role_privilege
-- ----------------------------
INSERT INTO `cms_role_privilege` VALUES ('1', '1', '1');
INSERT INTO `cms_role_privilege` VALUES ('2', '1', '5');
INSERT INTO `cms_role_privilege` VALUES ('3', '1', '10');
INSERT INTO `cms_role_privilege` VALUES ('4', '1', '15');
INSERT INTO `cms_role_privilege` VALUES ('5', '1', '21');
INSERT INTO `cms_role_privilege` VALUES ('6', '1', '26');
INSERT INTO `cms_role_privilege` VALUES ('7', '1', '35');
INSERT INTO `cms_role_privilege` VALUES ('8', '1', '41');
INSERT INTO `cms_role_privilege` VALUES ('9', '1', '46');
INSERT INTO `cms_role_privilege` VALUES ('10', '2', '4');
INSERT INTO `cms_role_privilege` VALUES ('11', '2', '7');
INSERT INTO `cms_role_privilege` VALUES ('12', '2', '8');
INSERT INTO `cms_role_privilege` VALUES ('13', '2', '11');
INSERT INTO `cms_role_privilege` VALUES ('14', '2', '12');
INSERT INTO `cms_role_privilege` VALUES ('15', '2', '13');
INSERT INTO `cms_role_privilege` VALUES ('16', '2', '16');
INSERT INTO `cms_role_privilege` VALUES ('17', '2', '18');
INSERT INTO `cms_role_privilege` VALUES ('18', '2', '19');
INSERT INTO `cms_role_privilege` VALUES ('19', '2', '22');
INSERT INTO `cms_role_privilege` VALUES ('20', '2', '23');
INSERT INTO `cms_role_privilege` VALUES ('21', '2', '24');
INSERT INTO `cms_role_privilege` VALUES ('22', '2', '27');
INSERT INTO `cms_role_privilege` VALUES ('23', '2', '28');
INSERT INTO `cms_role_privilege` VALUES ('24', '2', '37');
INSERT INTO `cms_role_privilege` VALUES ('25', '2', '39');
INSERT INTO `cms_role_privilege` VALUES ('26', '2', '42');
INSERT INTO `cms_role_privilege` VALUES ('27', '2', '43');
INSERT INTO `cms_role_privilege` VALUES ('28', '2', '44');
INSERT INTO `cms_role_privilege` VALUES ('29', '2', '47');
INSERT INTO `cms_role_privilege` VALUES ('30', '2', '49');
INSERT INTO `cms_role_privilege` VALUES ('31', '2', '50');
INSERT INTO `cms_role_privilege` VALUES ('32', '2', '51');
INSERT INTO `cms_role_privilege` VALUES ('33', '2', '52');
INSERT INTO `cms_role_privilege` VALUES ('34', '2', '53');

-- ----------------------------
-- Table structure for cms_user
-- ----------------------------
DROP TABLE IF EXISTS `cms_user`;
CREATE TABLE `cms_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birth` varchar(255) DEFAULT NULL,
  `register_time` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_face` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_user
-- ----------------------------
INSERT INTO `cms_user` VALUES ('1', 'admin', '111111', '18812344321', '莱瑞', 'female', '1572883200000', null, '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');
INSERT INTO `cms_user` VALUES ('2', 'terry', '111111', '18867541234', '泰瑞', 'female', null, null, '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');
INSERT INTO `cms_user` VALUES ('3', 'jacky', '111111', '18812344325', '杰克', 'female', null, '1573892938430', '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');
INSERT INTO `cms_user` VALUES ('4', 'test01', '111111', '18812344321', '测试01', 'male', '1574784000000', '1573994760850', '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');
INSERT INTO `cms_user` VALUES ('5', 'larry', '111111', '18812344321', '超级管理员', 'male', null, '1574155005310', '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');
INSERT INTO `cms_user` VALUES ('6', 'test', '111111', '00000000000', '测试', 'male', '1574784000000', '1584346827920', '正常', 'http://101.200.58.102:8080/manager/images/touxiang.jpg');

-- ----------------------------
-- Table structure for cms_user_role
-- ----------------------------
DROP TABLE IF EXISTS `cms_user_role`;
CREATE TABLE `cms_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_role_user` (`user_id`),
  KEY `fk_user_role_role` (`role_id`),
  CONSTRAINT `fk_user_role_role` FOREIGN KEY (`role_id`) REFERENCES `cms_role` (`id`),
  CONSTRAINT `fk_user_role_user` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_user_role
-- ----------------------------
INSERT INTO `cms_user_role` VALUES ('1', '5', '1');
INSERT INTO `cms_user_role` VALUES ('2', '1', '2');
INSERT INTO `cms_user_role` VALUES ('3', '2', '3');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', 'terry', '12');
INSERT INTO `test` VALUES ('2', 'larry', '13');
INSERT INTO `test` VALUES ('3', '李四', '123321');
