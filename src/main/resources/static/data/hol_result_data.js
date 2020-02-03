var holType = {
    "R":["现实型(实际型)","具有顺从、坦率、谦虚、自然、坚毅、实际、有礼、害羞、稳健、节俭的特征","1、喜爱实用性的职业或情境，以从事所喜好的活动，避免社会性的职业或情境。2、用具体实际的能力解决工作及其他方面的问题，较缺乏人际关系方面的能力。3、重视具体的事物，如金钱，权力、地位等。","工人、农民、土木工程师"],
    "I":["研究型","具有分析、谨慎、批评、好奇、独立、聪明、内向、条理、谦逊、精确、理发、保守的特征","1、喜爱研究性的职业或情境，避免企业性的职业或情境。2、用研究的能力解决工作及其他方面的问题，即自觉、好学、自信，重视科学，但缺乏领导方面的才能。","科研人员、数学和生物方面的专家"],
    "A":["艺术型","具有复杂、想象、冲动、独立、直觉、无秩序、情绪化、理想化、不顺从、有创意、富有表情、不重实际的特征","1、喜爱艺术性的职业或情境，避免传统性的职业或情境。2、富有表达能力和直觉、独立、具创意、不顺从（包括表演、写作、语言），并重视审美的领域。","诗人、艺术家"],
    "S":["社会型","具有合作、友善、慷慨、助人、仁慈、负责、圆滑、善社交、善解人意、说服他人、理想主义等特征","1、喜爱社会型的职业或情境，避免实用性的职业或情境，并以社交方面的能力解决工作及其他方面的问题，但缺乏机械能力与科学能力。2、喜欢帮助别人、了解别人，有教导别人的能力，且重视社会与伦理的活动与问题","教师、牧师、辅导人员"],
    "E":["企业型(管理型)","具有冒险、野心、独断、冲动、乐观、自信、追求享受、精力充沛、善于社交、获取注意、知名度等特征","1、喜欢企业性质的的职业或环境，避免研究性质的职业或情境，会以企业方面的能力解决工作或其他方面的问题能力。2、有冲动、自信、善社交、知名度高、有领导与语言能力，缺乏科学能力，但重视政治与经济上的成就。","推销员、政治家、企业家"],
    "C":["常规型(传统型、事务型)","具有顺从、谨慎、保守、自控、服从、规律、坚毅、实际稳重、有效率、但缺乏想象力等特征","1、喜欢传统性质的的职业或环境，避免艺术性质的职业或情境，会以传统的能力解决工作或其他方面的问题。2、喜欢顺从、规律、有文书与数字能力，并重视商业与经济上的成就。","出纳、会计、秘书"],
}

var holData = {
    "RIA":["适合的典型专业有： 口腔医学、口腔医学技术、美术学、建筑类、园林、木材科学与工程、机械类",
    "适合的典型职业有：牙科技术员、陶工、建筑设计员、模型工、细木工、制作链条人员"],
    "RIS":["适合的典型专业有： 森林工程、木材科学与工程、林学类、纺织类、轻工类、电气类、能源与动力工程、焊接技术与工程",
        "适合的典型职业有：厨师、林务员、跳水员、潜水员、染色员、电器修理、眼镜制作、电工、纺织机器装配工、服务员、装玻璃工人、发电厂工人、焊接工、各业工程师"],
    "RIE":["适合的典型专业有：土木类、交通工程、船舶与海洋工程、海洋工程与技术、自然地理与资源环境、海洋资源与环境、环境科学与工程类、自然保护与环境生态类、航空航天类、电子信息类、机械类、自动化、家政学、矿业类、植物生产类、农业机械及自动化、车辆工程、汽车服务工程",
        "适合的典型职业有：建筑和桥梁工程、环境工程、航空工程、公路工程、电力工程、信号工程、电话工程、一般机械工程、自动工程、矿业工程、海洋工程、交通工程技术人员、制图员、家政经济人员、计量员、农民、农场工人、农业机械操作、清洁工、无线电修理、汽车修理、手表修理、管工、线路装配工、工具仓库管理员"],
    "RIC":["适合的典型专业有：航海技术、轮机工程、救助与打捞工程、船舶电子电气工程、口腔医学类、口腔医学技术、车辆工程、农业机械化及其自动化、车辆工程、机械工程、动植物检疫、卫生检验与检疫、学前教育、印刷工程",
        "适合的典型职业有：船上工作人员、接待员、杂志保管员、牙医助手、制帽工、磨坊工、石匠、机器制造、机车(火车头)制造、农业机器装配、汽车装配工、缝纫机装配工、钟表装配和检验、电动器具装配、鞋匠、锁匠、货物检验员、电梯机修工、托儿所所长、钢琴调音员、装配工、印刷工、建筑钢铁工作、卡车司机"],
    "RAI":["适合的典型专业有：园艺、材料成型及控制工程、工业设计、纺织类、轻工类、木材科学与工程、编辑出版学、数字出版",
        "适合的典型职业有：手工雕刻、玻璃雕刻、制作模型人员、家具木工、制作皮革品、手工绣花、手工钩针纺织、排字工作、印刷工作、图画雕刻、装订工"],
    "RSE":["适合的典型专业有：公安学类、公安技术类、机械类、地质类、动物医学类",
        "适合的典型职业有：消防员、交通巡警、警察、门卫、理发师、房间清洁工、屠夫、锻工、开凿工人、管道安装工、出租汽车驾驶员、货物搬运工、送报员、勘探员、娱乐场所的服务员、起卸机操作工、灭害虫者、电梯操作工、厨房助手"],
    "RSI":["适合的典型专业有：纺织类、农学、艺术学、管理学",
        "适合的典型职业有：纺织工、编织工、农业学校教师、某些职业课程教师(诸如艺术、商业、技术、工艺课程)、雨衣上胶工"],
    "REC":["适合的典型专业有：家政学、物理学类、化学类、生物科学类、动物生产类、动物医学类",
        "适合的典型职业有：抄水表员、保姆、实验员、动物饲养员、动物管理员"],
    "REI":["适合的典型专业有：航海技术、轮机工程、交通运输、船舶电子电气工程、电气工程及其自动化、物理学类、化学类、生物科学类",
        "适合的典型职业有：轮船船长、航海领航员、大副、试管实验员"],
    "RES":["适合的典型专业有：旅游管理类、动物生产类、水产类、轮机工程、交通工程、土木类、建筑类",
        "适合的典型职业有：旅馆服务员、家畜饲养员、渔民、渔网修补工、水手长、收割机操作工、搬运行李工人、公园服务员、救生员、登山导游、火车工程技术员、建筑工作、铺轨工人"],
    "RCI":["适合的典型专业有：测绘类、地质类、仪器类、轨道交通信号与控制、设施农业科学与工程、化学类、石油工程 、图书情报与档案管理类、机械工程、矿业类、纺织类、木材科学与工程、轻工类、工业设计、焊接技术与工程",
        "适合的典型职业有：测量员、勘测员、仪表操作者、农业工程技术、化学工程技师、民用工程技师、石油工程技师、资料室管理员、探矿工、煅烧工、烧窖工、矿工、保养工、磨床工、取样工、样品检验员、纺纱工、炮手、漂洗工、电焊工、锯木工、刨床工、制帽工、手工缝纫工、油漆工、染色工、按摩工、木匠、农民建筑工作、电影放映员、勘测员助手"],
    "RCS":["适合的典型专业有：轮机工程、土木类、水利类、农业工程、农业建筑环境与能源工程、农业水利工程、交通工程、海洋工程与技术、采矿工程、纺织工程、电气工程及其自动化",
        "适合的典型职业有：公共汽车驾驶员、一等水手、游泳池服务员、裁缝、建筑工作、石匠、烟囱修建工、混凝土工、电话修理工、爆炸手、邮递员、矿工、裱糊工人、纺纱工"],
    "RCE":["适合的典型专业有：建筑类、机械类、测绘类、植物生产类、图书情报与档案管理类",
        "适合的典型职业有：建筑师、机械师、测绘师、打井工、吊车驾驶员、农场工人、邮件分类员、铲车司机、拖拉机司机"],
    "IAS":["适合的典型专业有：经济学类、财政学类、经济与贸易类、国际商务、心理学类、哲学类、临床医学、中西医结合类、数学类",
        "适合的典型职业有：普通经济学家、农场经济学家、财政经济学家、国际贸易经济学家、实验心理学家、工程心理学家、心理学家、哲学家、内科医生、数学家"],
    "IAR":["适合的典型专业有：社会学类、天文学类、化学类、物理学类、基础医学、生物信息学、考古学、文物保护技术、文物与博物馆学",
        "适合的典型职业有：人类学家、天文学家、化学家、物理学家、医学病理、动物标本剥制者、化石修复者、艺术品管理者"],
    "ISE":["适合的典型专业有：食品科学与工程类、食品卫生与营养学、公安学类、安全科学与工程类、动物医学类",
        "适合的典型职业有：营养学家、饮食顾问、火灾检查员、动植物检疫"],
    "ISC":["适合的典型专业有：公安学类、电气类、电子信息类、法医学类、新闻传播学类、医学技术类",
        "适合的典型职业有：侦察员、电视播音室修理员、电视修理服务员、验尸室人员、编目录者、医学实验定技师、调查研究者"],
    "ISR":["适合的典型专业有：生物科学类、化学工程与工业生物工程、生物医学工程类、生物工程类、应用生物科学、口腔学类、眼视光学医学、眼视光学、临床医学、中西医结合类",
        "适合的典型职业有：生物学家、水生生物学者,昆虫学者、微生物学家、配镜师、矫正视力者、细菌学家、牙科医生、骨科医生"],
    "ISA":["适合的典型专业有：心理学类、临床医学、中西医结合类、工商管理、精神医学、眼视光医学、护理学、管理科学、医学技术类、工业工程类",
        "适合的典型职业有：实验心理学家、普通心理学家、发展心理学家、教育心理学家、社会心理学家、临床心理学家、目标学家、皮肤病学家、精神病学家、妇产科医师、眼科医生、五官科医生、医学实验室技术专家、民航医务人员、护士、医疗器械工程师、工作分析工程师"],
    "IES":["适合的典型专业有：生物科学类、化学生物学、生物医学工程类、生物工程类、应用生物科学、地球物理科学类、地质学类、地质类、纺织类、化学类、化工与制药类、药学类、中药学类",
        "适合的典型职业有：细菌学家、生理学家、化学专家、地质专家、地理物理学专家、纺织技术专家、医院药剂师、工业药剂师、药房营业员"],
    "IEC":["适合的典型专业有：计算机类、图书情报与档案管理类、经济统计学、统计学类、财政学、财务管理",
        "适合的典型职业有：计算机科学家、软件工程师、档案保管员、保险统计员、证券分析师、财务主管"],
    "ICR":["适合的典型专业有：医学检验技术、卫生检验与检疫、飞行器质量与可靠性、食品质量与安全、质量管理工程、药学类、中药学、物理学类、地质学、环境科学与工程类、自然地理与资源环境、海洋资源与环境、自然保护与环境生态类、农业资源与环境、法学、计算机类、电子信息类、动物生产类、动物医学类、水利类、农业水利工程、中医学类、中西医结合类、公共卫生与预防医学类、基础医学类",
        "适合的典型职业有：质量检验技术员、药剂师、物理学家、地质学技师、环境工程师、法官、图书馆技术辅导员、计算机科学家、医院听诊员、家禽检查员、水利工程师、理疗师、中医师、公共卫生医师、医疗顾问"],
    "IRA":["适合的典型专业有：地理科学类、地理国情监测、地质类、物理学类、矿物资源工程、考古学、古生物学、石油工程、地球物理学、大气科学类、社会学、统计学类、临床医学、人文地理与城乡规划、城乡规划",
        "适合的典型职业有：地理学家、地质学家、声学物理学家、矿物学家、古生物学家、石油学家、地震学家、声学物理学家、原子和分子物理学家、电学和磁学物理学家、气象学家、设计审核员、人口统计学家、数学统计学家、外科医生、城市规划家、气象员"],
    "IRS":["适合的典型专业有：物理学类、海洋科学类、植物生产类、动物生产类、食品科学与工程类、食品卫生与营养学、食品科学与工程类、园艺、生物科学类、药学类、动物医学类放射医学、医学检验技术、医学实验技术、化学生物学、地理科学类",
        "适合的典型职业有：流体物理学家、物理海洋学家、等离子体物理学家、农业科学家、动物学家、食品科学家、园艺学家、植物学家、细菌学家、解剖学家、动物病理学家、作物病理学家、药物学家、生物化学家、生物物理学家、细胞生物学家、临床化学家、遗传学家、分子生物学家、质量控制工程师、地理学家、兽医、放射性治疗技师"],
    "IRE":["适合的典型专业有：化学类、材料化学、化学工程与工业生物工程、药物化学、纺织工程、食品科学与工程类、食品卫生与营养学、水产类、材料类、土木类、航空航天类、电气类、冶金工程、地质类、矿物资源工程、口腔医学、测绘类、公共卫生与预防医学类",
        "适合的典型职业有：化学家、化验员、化学工程师、纺织工程师、食品技师、渔业技术专家、材料和测试工程师、电气工程师、土木工程师、航空工程师、行政官员、冶金专家、原子核工程师、陶瓷工程师、地质工程师、电力工程量、口腔科医生、牙科医生、公共卫生医师、制图员、测绘师"],
    "IRC":["适合的典型专业有：交通运输、物理学类、图书情报与档案管理类、植物生产类、自然保护与环境生态类、动物生产类、生物科学类、油气储运工程、海洋油气工程、安全工程、采矿工程、石油工程、纺织工程、计算机类、机械工程、测控技术与仪器",
        "适合的典型职业有：飞机领航员、飞行员、物理实验室技师、文献检查员、农业技术专家、动植物技术专家、生物技师、油管检查员、工商业规划者、矿藏安全检查员、纺织品检验员、照相机修理者、工程技术员、编计算程序者、工具设计者、仪器维修工"],
    "CRI":["适合的典型专业有：计算机类、汉语言、应用语言学、秘书学、经济学类、金融学类、会计学、财务管理、审计学、机械工程、机械设计制造及其自动化、材料成型及控制工程",
        "适合的典型职业有：商务程序员、簿记员、会计、记时员、铸造机操作工、打字员、按键操作工、复印机操作工"],
    "CRS":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、新闻传播学类、图书情报与档案管理类",
        "适合的典型职业有：会计、仓库保管员、档案管理员、缝纫工、讲述员、收款人"],
    "CRE":["适合的典型专业有：印刷工程、信息资源管理、新闻传播学类、电气工程及其自动化、交通运输、交通设备与控制工程、交通管理工程、交通管理",
        "适合的典型职业有：标价员、实验室工作者、广告管理员、自动打字机操作员、电动机装配工、缝纫机操作工、空中交通控制员"],
    "CIS":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、测绘类、房地产开发与管理、资产评估、卫生检验与检疫、医学检验技术、工业工程类",
        "适合的典型职业有：记账员、顾客服务员、报刊发行员、土地测量员、保险公司职员、会计师、估价员、邮政检查员、外贸检查员"],
    "CIE":["适合的典型专业有：中国语言文学类、经济统计学、统计学类、采购管理、编辑出版学、网络与新媒体、数字出版",
        "适合的典型职业有：记录员、打字员、统计员、支票记录员、订货员、校对员、办公室工作人员"],
    "CIR":["适合的典型专业有：中国语言文学类、编辑出版学、网络与新媒体、数字出版、机械工程、测控技术与仪器、电气类、自动化类、印刷工程等",
        "适合的典型职业有：记录员、校对员、工程职员、海底电报员、检修计划员、发扳员"],
    "CSE":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、旅游管理类、图书情报与档案管理类、文物与博物馆学、管理科学与工程类、工商管理类",
        "适合的典型职业有：出纳员、会计、接待员、通讯员、电话接线员、卖票员、旅馆服务员、私人职员、商学教师、旅游办事员、商务教师、图书编目员、法庭书记、保险承销商、医疗记录员、博物馆登记员、档案管理员"],
    "CSR":["适合的典型专业有：物流管理与工程类、交通运输、交通工程、经济学类、金融学类、会计学、财务管理、审计学、中国语言文学类、计算机类、图书情报与档案管理类、公安学类",
        "适合的典型职业有：运货代理商、铁路职员、交通检查员、办公室通信员、出纳员、簿记员、会计、银行财务职员、计算机操作员、图书馆管理员、档案管理员、侦查员"],
    "CSA":["适合的典型专业有：文物与博物馆学、文物保护技术、考古学、新闻传播学类、图书情报与档案管理类、教育技术学",
        "适合的典型职业有：艺术品收藏夹、艺术品鉴定家、博物馆员、艺术评论家、电教员、媒体制作员"],
    "CER":["适合的典型专业有：秘书学、经济学类、金融学类、会计学、财务管理、审计学、统计学类、安全工程、计算机类、信息管理与信息系统、信息资源管理、采购管理、工业工程类",
        "适合的典型职业有：邮递员、数据处理员、办公室办事员、出纳员、预算分析员、督察员、信息服务与支持、采购经理、机器操作员、监理、自动售货点销售助理、质量检验员、信用卡工作员"],
    "CEI":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、统计学类、市场营销、新闻传播学类",
        "适合的典型职业有：推销员、保险业务员、编辑、客户检查员、经济分析家、会计、审计师"],
    "CES":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、法学类、行政管理、公共关系学、人力资源管理、财政学类、医学影像技术",
        "适合的典型职业有：银行会计、成本会计、记账员、法人秘书、速记员、法院报告人、区域立法助理、人事助理、医疗秘书、X光检查咨询、票务员、税务咨询"],
    "ECI":["适合的典型专业有：经济学类、金融学类、会计学、财务管理、审计学、信用管理、房地产开发与管理、法学、工商管理",
        "适合的典型职业有：银行行长、审计员、信用管理员、地产管理员、商业管理员、法官"],
    "ECS":["适合的典型专业有：信用管理、采购管理、海关管理、经济学类、金融学类、会计学、财务管理、审计学、公共管理类、家政学、行政管理、法学、旅游管理类",
        "适合的典型职业有：信用办事员、保险人员、各类进货员、海关服务经理、售货员,购买员、会计、税务会计、旅游业务员、采购员、市政经理、饭店经理、家政员、保险业务员、行政经理、法务助理、零售店经理、证券经纪人"],
    "ERI":["适合的典型专业有：土木类、物业管理、工业工程类、植物生产类、护理学、农业经济管理类、市场营销、机械类、油气储运工程、税收学、林业工程、木材科学与工程、电气类、能源与动力工程、测绘类、交通工程、轨道交通信号与控制、交通运输、交通设备与控制工程、交通管理工程、交通管理",
        "适合的典型职业有：建筑物管理员、工业工程师、农场管理员、护士长、农业经营管理人员、化学设备销售工程师、机械设备销售工程师、设备保养工程师、油库经理、税务代理、钻井或生产班组长、土木工程队工头、伐木工头、电厂主管、测绘主管、维护保养主管、彩陶主管、现场工程师、燃料系统维护主管、业务评估经理、洗衣店经理、路况检测官、调度员、日程业务员、菜蔬生产主管、机器运作监察员、碳电极监察员、胶合板监察员粒子轨道监察员等等"],
    "ERA":["适合的典型专业有：风景园林、园林、园艺、自动化、电气类、食品科学与工程类、食品卫生与营养学、全球健康学、海事管理、交通工程",
        "适合的典型职业有：公园主管、测评主管、变压器/变频器监控员、保健专家、维护主管、粮食加工主管、锅炉监控员、煤炭加工监控员、回收站主管、海事销售与服务主管、铁路设备操作工等"],
    "ERS":["适合的典型专业有：物业管理、审计学、市场营销、法学等200多种职业",
        "适合的典型职业有：扬谷机监控员、仓库管理员、房屋管理员、货栈监督管理员、公寓经理、服务经理、销售代理、产品演示员、职业运动员、经纪人代表、银行核查员、法务调解员、借贷官、研究与开发主任等200多种职业"],
    "ERC":["适合的典型专业有：机械工程、航海技术、轮机工程、木材科学与工程、采矿工程、石油工程、车辆工程、兵器类、电子商务类、医学影像技术、矿业类、土木类、建筑类、水利类、车辆工程、交通工程、农业工程、农业水利工程、设施农业科学与工程",
        "适合的典型职业有：设备维修主管、邮政局长、渔船船长、机械操作领班、木工领班、瓦工领班、驾驶员领班、网店销售员、颅像分析师、磨坊监控员、设备维修主管、军械装备员、机动车检验员、童车与轮椅检验员、矿产监控员、压榨机操作员、建筑承包商"],
    "EIR":["适合的典型专业有：经济与贸易类、国际商务、工业工程类、机械工程、港口航道与海岸工程、水务工程、市场营销、教育学类、给排水科学与工程、测绘类、土木类、新闻传播学类、交通运输、交通管理、广播电视编导、戏剧影视导演、影视摄影与制作",
        "适合的典型职业有：商业企业办公室主任、外贸商、工业工程师、维护主管、港口工程师、项目经理、称量设备销售代表、教育局办事员、水上作业主管、排水系统监控员、测绘主管、包工头、机动车指导员、生产主管、摩托车赛手、科学、技术和有关周期出版物的管理员、影片制作人"],
    "EIC":["适合的典型专业有：审计学、知识产权、考古学、文物与博物馆学、文物保护技术、安全工程、交通运输、港口航道与海岸工程、卫生监督、预防医学",
        "适合的典型职业有：银行总核员、专利代理人、鉴定人、运输服务检查员、安全检查员、废品收购人员、港口经理、工业健康工程师、生产工程师"],
    "EIS":["适合的典型专业有：公安学类、公安技术类、交通工程、安全工程、工商管理类、电子商务类、保险学、教育学类、采购管理、食品科学与工程类、食品卫生与营养学、经济学类、物业管理、口腔学、口腔医学技术",
        "适合的典型职业有：警官、侦察员、交通检验员、安全咨询员、合同管理者、商人、保险理赔估价员、教育与训练经理、跨学科经济学、教育专家、营长、粮油采购员、管理员、食品服务主任、物业主管、实验室主管、牙科诊所主管"],
    "EAS":["适合的典型专业有：法学、社会学类、政治学类、公共事业管理、行政管理、劳动与社会保障、城市管理、新闻传播学类、工商管理类",
        "适合的典型职业有：法官、律师、公证人、发型师、美容师、公共关系代表、记者、外交家、销售员、节目主持人、专栏作家、试听设施管理员、股票与市场业务员、时尚协调员、现场监理、经理人、新闻发人"],
    "EAR":["适合的典型专业有：环境科学与工程类、公共事业管理、行政管理、城市管理、公共关系学、安全工程、土木类、工商管理、文化产业管理、体育经济与管理、动物生产类、动物医学类、公安技术类、公安学类、文化产业管理、文物与博物馆学、会展经济与管理",
        "适合的典型职业有：环境监察员、社区管理员、消防检察员、展览室管理员、舞台管理员、播音员、训兽员、警察、工商管理员、安全监察员、领班、监理"],
    "ESC":["适合的典型专业有：工商管理类、公共管理类、财政学类、体育学类、工业工程类、基础医学、公共卫生与预防医学类、房地产开发与管理、交通运输、新闻传播学类、会计学、旅游管理类",
        "适合的典型职业有：理发师、裁判员、政府行政管理员、财政管理员、工程管理员、职业病防治、售货员、商业经理、办公室主任、人事负责人、调度员、广告销售代表、福利经理、教育训练经理、殡仪人员及主任、借贷主管、地产代理、饭店经理、旅游代理"],
    "ESR":["适合的典型专业有：市场营销、护理学、新闻传播学类、保险学、经济学类、金融学类、会计学、财务管理、审计学、房地产开发与管理、植物生产类、草学类",
        "适合的典型职业有：家具售货员、书店售货员、公共汽车的驾驶员、日用品售货员、护士长、自然科学和工程的行政领导、广告销售代表、金融规划师、殡仪馆主管、行政经理、零售店经理、农业经理、地产经理、职业安置顾问"],
    "ESI":["适合的典型专业有：文物与博物馆学、考古学、文物保护技术、图书情报与档案管理类、交通运输、市场营销、法学、交通运输、市场营销、护理学、新闻传播学类、保险学、经济学类、金融学类、会计学、财务管理、公共事业管理、法学类、公安学类",
        "适合的典型职业有：博物馆管理员、图书馆管理员、古迹管理员、饮食业经理、地区安全服务管理员、技术服务咨询者、超级市场管理员、零售商店店员、批发商、出租汽车服务站调度、侦探/检察官、健康服务监理、急救技术员、证券经纪人、选拔与人争专家、地方法官、音乐治疗师、证券交易员、税务代理、预算官、信贷咨询师、营养顾问、调度员、区域客户代理、财产规划师、团体工作者"],
    "ESA":["适合的典型专业有：文物与博物馆学、考古学、文物保护技术、图书情报与档案管理类、轮机工程、航海技术、船舶电子电气工程、法学、采购管理、外交学、外国语言文学类、新闻传播学类、市场营销",
        "适合的典型职业有：博物馆馆长、报刊管理员、音乐器材售货员、广告商售画营业员、导游、(轮船或班机上的)事务长、飞机上的服务员、船员、法官、律师、飞行服务员、销售员、销售经理、广告主管、部门经理/分公司经理、采购员、客服经理、老板、外事服务官、翻译、律师/法务代理、政府官员、社会服务主任、记者、编辑"],
    "ASE":["适合的典型专业有：中国语言文学类、外国语言文学类、新闻传播学类、艺术教育、人文教育、戏剧影视导演、舞蹈表演、舞蹈学、舞蹈编导",
        "适合的典型职业有：戏剧导演、舞蹈教师、美术教师、音乐教师、剧作教练、广告撰稿人、公告经理、报刊、专栏作者、记者、演员、英语翻译、中文教师、编辑"],
    "ASI":["适合的典型专业有：中国语言文学类、外国语言文学类、新闻传播学类、艺术教育、哲学类、音乐与舞蹈学类、人文教育",
        "适合的典型职业有：音乐教师、乐器教师、美术教师、管弦乐指挥,合唱队指挥、歌星、演奏家、哲学家、作家、广告经理、时装模特、广告/传媒撰稿人、翻译、外语教师、文学教师"],
    "AER":["适合的典型专业有：广播电视学、传播学、戏剧与影视学类、绘画",
        "适合的典型职业有：新闻摄影师、电视摄影师、艺术指导、录音指导、丑角演员、魔术师、木偶戏演员、骑士、跳水员、漫画家、音乐指挥、导演"],
    "AEI":["适合的典型专业有：音乐表演、音乐学、广播电视编导、戏剧影视导演、人文教育、中国语言文学类、外国语言文学类、新闻传播学类、心理学类、土地资源管理、服装设计与工程、知识产权、作曲与作曲技术理论、戏剧影视文学、服装与服饰设计、绘画",
        "适合的典型职业有：音乐指挥、舞台指导、电影导演、语言教师、书刊插图画家与编辑、心理顾问、喜剧演员、民间艺人、乐师、音乐制作人、剧作家、公告设计师、商业策划师、时尚设计师、连环画作家、专利代理、共有地产主管、新闻记者等"],
    "AES":["适合的典型专业有：戏剧与影视学类、哲学类、中国语言文学类、护理学、新闻传播学类、音乐表演、播音与主持艺术",
        "适合的典型职业有：演员、流行歌手、舞蹈演员、电影导演、广播节目主持人、舞蹈教师、口技表演者、喜剧演员、模特、护士、广告设计师、作家、媒体制作人、编辑"],
    "AIS":["适合的典型专业有：哲学类、新闻传播学类、工业工程类、绘画、中国画、服装与服饰设计、服装设计与工程、戏剧影视文学",
        "适合的典型职业有：画家、剧作家、编辑、评论家、时装艺术大师、新闻摄影师、男演员、文学作者、工业工程师"],
    "AIE":["适合的典型专业有：产品设计、雕塑、服装与服饰设计、服装设计与工程、园艺、园林、风景园林、工业设计",
        "适合的典型职业有：花匠、皮衣设计师、工业产品设计师、剪影艺术家、复制雕刻品大师"],
    "AIR":["适合的典型专业有：建筑学类、包装工程、影视摄影与制作、园艺、园林、风景园林、雕塑、包装工程、产品设计、工艺美术、环境设计",
        "适合的典型职业有：建筑师、画家、摄影师、绘图员、环境美化工、雕刻家、包装设计师、陶器设计师、绣花工、漫画工"],
    "SEC":["适合的典型专业有：社会学类、公共关系学、教育学类、旅游管理类、管理科学、公共事业管理、法学、食品卫生与营养学、食品科学与工程、食品质量与安全",
        "适合的典型职业有：社会活动家、退伍军人服务官员、工商会事务代表、教育咨询者、宿舍管理员、旅馆经理、饮食服务管理员、律师"],
    "SER":["适合的典型专业有：公共管理类、农业经济管理类、体育教育、运动训练、社会体育指导与管理、护理学、营销学、公安学类、公安技术类",
        "适合的典型职业有：行政管理、体育教练、游泳指导、护士、公关专员、警察"],
    "SEI":["适合的典型专业有：公共管理类、历史学类、经济学类、金融学类、外交学、教育学类、法学、中国语言文学类、外交学、哲学类、图书情报与档案管理类、新闻传播学类、外交学",
        "适合的典型职业有：大学校长、学院院长、医院行政管理员、历史学家、家政经济学家、职业学校教师、资料员、律师、记者、编辑、外交官、行政管理员、劳资协调/仲裁员"],
    "SEA":["适合的典型专业有：旅游管理类、外交学、经济与贸易类、国际商务、宗教学、公共管理类、教育学类、社会学类",
        "适合的典型职业有：娱乐活动管理员、国外服务办事员、社会服务助理、一般咨询者、宗教教育工作者、培训师"],
    "SCE":["适合的典型专业有：秘书学、法学、房地产开发与管理、人力资源管理、外国语言文学类、社会学类、劳动与社会保障、旅游管理类、工商管理、资产评估、新闻传播学类、新闻传播学类",
        "适合的典型职业有：部长助理、律师助理、福利机构职员、生产协调人、环境卫生管理人员、戏院经理、餐馆经理、售票员、地产估价师、记者、行政管理专员、人力资源干事、对外汉语教师、社会工作者、导游、劳资关系专员"],
    "SRI": ["中西医临床医学、临床医学、医学影像学、人文地理与城乡规划、城乡规划、土地资源管理、园艺、风景园林、园林、体育学类、生物医学工程类、基础医学类、工程管理、管理科学、运动康复、运动人体科学、康复治疗学、听力与言语康复学",
        "适合的典型职业有：外科医师助手、医院服务员、工程管理员、项目经理、城市规划师、急救医师、职业治疗师、园艺师、放射医师、理疗师、康复医师"],
    "SRE":["适合的典型专业有：体育学类、临床医学、中西医临床医学、家政学、基础医学、物业管理、公安类、公安技术类、教育学类、口腔医学、口腔医学技术、护理学、动物生产类",
        "适合的典型职业有：体育教师、体育教练、专业运动员、健身教练、职业病治疗者、房管员、儿童家庭教师、警察、引座员、传达员、保姆、户外培训师、驯兽师、杂技团演员、外科医生、牙医、护士、保姆、服务员、警察"],
    "SRC":["适合的典型专业有：护理学、教育学类、动物生产类、中医学类、中西医结合类、基础医学、公共卫生与预防医学类、运动康复、康复治疗学、听力与言语康复学、体育学类",
        "适合的典型职业有：护理员、护理助理、医院勤杂工、理发师、学校儿童服务人员、驯兽师、康复医师、中医师、特殊教育教师、幼儿教师、公共医师、健康顾问、家庭医生、健身教练"],
    "SIA":["适合的典型专业有：社会学类、民族学、心理学类、植物生产类、自然保护与环境生态类、草业科学、土木类、建筑类、数学类、物理类、医学、生物科学类、生物医学工程类、化学工程与工业生物工程、应用生物科学、教育学类",
        "适合的典型职业有：社会学家、社会工作者、心理咨询师、学校心理学家、政治科学家、大学或学院的系主任、大学或学院的教育学教师、大学农业教师、大学工程和建筑课程的教师、大学法律教师、大学数学、医学、物理、社会科学和生命科学的教师、研究生助教、成人教育教师、中小学教师、商业教师、培训师"],
    "SIE":["适合的典型专业有：食品营养与检验教育、食品卫生与营养学、海关管理、海事管理、安全工程、经济学类、财政学类、金融学类、会计学、财务管理、审计学教育学类、人文教育、公共管理类、护理学、劳动与社会保障、物业管理、人力资源管理、边防管理、边防指挥、新闻传播学类",
        "适合的典型职业有：健康顾问、饮食学家、海关检查员、安全检查员、税务稽查员、校长、文科教师、公共政策顾问、公共关系专员、护士、营养顾问、劳资关系专员、人力资源顾问、物业管理员、贸易专员、记者、海关专员"],
    "SIC":["适合的典型专业有：动物科学、动物医学、监狱学、新闻传播学类、劳动与社会保障、人力资源管理、人文教育、心理学类、物业管理、社会学、社会工作",
        "适合的典型职业有：描图员、兽医助手、诊所助理、体检检查员、监督缓刑犯的工作者、娱乐指导者、咨询人员、人力资源专员、记者、劳资关系专员、贸易专员、心理咨询师、课程开发专员、培训师、文科教师、物业管理员、社会工作者"],
    "SIR":["适合的典型专业有：临床医学、护理学、麻醉学、家政学、体育教育、运动训练、武术与民族传统体育、社会体育指导与管理、生物科学类、动物生产类、全球健康学、假肢矫形工程",
        "适合的典型职业有：理疗员、救护队工作人员、手足病医生、职业病治疗助手、麻醉助理、听力专家、矫正器修配者、修复师、护士、保姆、健身教练、健康顾问、驯兽师、生物教师、健康教师"],
    "SAE":["适合的典型专业有：市场营销、教育学类、心理学类、社会学类、宗教学、政治学与行政学、农业经济管理类、公共管理类",
        "适合的典型职业有：消费者事务顾问、普通学校教师、培训师、行政顾问、学校咨询师、社会工作者、各类文科教师、牧师等等"],
    "ACE":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细的公共艺术,如广告设计、宣传画、影视摄影、漫画、动漫设计、发型设计、化妆、服装设计、播音主持等",
        "这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细的公共艺术,如广告设计、宣传画、影视摄影、漫画、动漫设计、发型设计、化妆、服装设计、播音主持等"],
    "ACI":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而又高知识含量的艺术,如广告设计、宣传画、影视摄影、动漫设计、会展设计、建筑设计、书刊插图设计等",
        "这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而又高知识含量的艺术,如广告设计、宣传画、影视摄影、动漫设计、会展设计、建筑设计、书刊插图设计等"],
    "ACR":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而需要动手操作的公共艺术,如雕塑、舞蹈、漫画、服装设计、建筑设计、工艺品设计、模具师等",
        "这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而需要动手操作的公共艺术,如雕塑、舞蹈、漫画、服装设计、建筑设计、工艺品设计、模具师等"],
    "ACS":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而需要与人互动的公共艺术,如话剧、歌唱、相声等表演艺术,美容、美发、服装设计等服务性艺术,艺术教师、语言教师、书法家、笔迹鉴定师等",
        "这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是精细而需要与人互动的公共艺术,如话剧、歌唱、相声等表演艺术,美容、美发、服装设计等服务性艺术,艺术教师、语言教师、书法家、笔迹鉴定师等"],
    "AEC":["适合的专业有：新闻传播学类、影视摄影与制作、戏剧影视美术设计",
        "适合的职业有：新闻编辑、魔术师、影像师、摄影记者、打击乐师、算命师等"],
    "AIC":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是高知识含量而又精细的创意类专业与职业,如动漫设计、游戏设计、考古学、文物鉴定等",
        "这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑创意大类的专业与职业,尤其是高知识含量而又精细的创意类专业与职业,如动漫设计、游戏设计、考古学、文物鉴定等"],
    "ARC":["适合的专业有：园艺、园林、风景园林、考古学、文物与博物馆学、文物保护技术、材料成型及控制工程、产品设计、工业设计、动画、数字媒体艺术、舞蹈表演、舞蹈编导",
        "适合的职业有：手工艺人、园艺师、动漫设计师、舞蹈家、文物收藏家、模具师等等"],
    "ARE":["适合的专业有：会展经济与管理、考古学、文物与博物馆学、文物保护技术、雕塑、绘画、中国画",
        "适合的职业有：会展师、画家、雕塑家、西点师、文物收藏家等"],
    "ARI":["适合的专业有：工业设计、产品设计、服装与服饰设计、绘画、中国画、音乐表演、舞蹈表演、舞蹈编导、园艺、园林、建筑学类、服装设计与工程、测绘类、材料成型及控制工程、产品设计",
        "适合的职业有：设计工程师、画家、音乐家、舞蹈艺术家、园艺师、建筑师、文物收藏家、服装设计师、测绘师、模具师、手工艺人等等"],
    "ARS":["适合的专业有：音乐与舞蹈学类、会展经济与管理、服装与服饰设计、服装设计与工程、艺术设计学、环境设计、宝石及材料工艺学",
        "适合的职业有：舞蹈家、曲艺演员、魔术师、婚庆摄影师、个人形象设计师、会展师、服装设计师、室内设计师、舞台技师、珠宝加工技师等等"],
    "ASC":["适合的专业有：工业设计、广告学、广播电视学、艺术教育、服装设计与工程、服装设计与工艺教育、艺术学",
        "适合的职业有：乐器演奏家、模具师、剧作家、曲艺演员、魔术师、室内设计师、广告设计师、舞蹈演员、艺术教师等"],
    "ASR":["适合的专业是：艺术教育、艺术学、服装设计与工程、服装设计与工艺教育、宝石及材料工艺学、考古学、文物与博物馆学、文物保护技术",
        "适合的职业有：艺术教师、裁缝、会展设计师、室内设计师、美容美发师、时尚设计师、名画收藏家、影视摄影师、手工艺人、珠宝工匠等"],
    "CAE":["如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清",
        "如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清"],
    "CAI":["如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清",
        "如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清"],
    "CAR": ["如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清",
        "如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清"],
    "CAS": ["如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清",
        "如果测验结果可信,则表明您的性格极富有弹性,兼有事务型、创意型两类性格特征。但专门对应于这种性格的专业或职业很少,可以考虑事务性兼创意型两大类的专业与职业。如果测验过程中有疏漏或误解,则需进一步澄清"],
    "CEA":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑事务类和经营管理类的专业与职业,如：经济类、金融学类、财务管理、会计学、审计学、工业工程类、航海技术、市场营销、经济与贸易类、国际商务、等",
        "适合的职业有会计师、理财师、工业工程师、航运工程师、销售员、贸易业务员等等"],
    "CIA":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑事务类和研究类的专业与职业,如：经济学类、金融学类、财务管理、会计学、审计学、工业工程类、图书情报与档案管理类、软件工程、数学类、统计学类、测绘工程等",
        "适合的职业有会计师、理财师、工业工程师、图书馆员、软件工程师、数学家、统计师、金融精算师、测绘师等等"],
    "CRA":["这种性格很独特,专门对应于这种性格的专业或职业很少,但可以考虑事务类和实物类的专业与职业,如：经济学类、金融学类、财务管理、会计学、审计学、工业工程类、图书情报与档案管理类、文物与博物馆学、印刷工程、药学、中药学类、临床医学、中西医临床医学、口腔医学、口腔医学技术、测绘类等",
        "适合的职业有会计师、理财师、工业工程师、图书馆员、博物馆员、印刷工、药剂师、外科医生、牙医、测绘师等等"],
    "CSI":["适合的专业有：经济学类、金融学类、财务管理、会计学、审计学、市场营销、文物与博物馆学、图书情报与档案管理类、中国语言文学类、外国语言文学类、公共管理类、侦查学、经济与贸易类、国际商务",
        "适合的职业有：理财师、商学教师、销售员、图书馆员、博物馆员、档案馆员、语言教师、秘书、公务员、侦探、外贸人员等等"],
    "EAC":["适合的专业有：表演、新闻学、动画、播音与主持艺术、广告学、传播学、矿业类、艺术教育、艺术学、市场营销、管理科学与工程类",
        "适合的职业有：喜剧演员、记者、动漫工程师、播音与主持、媒体策划师、艺术制作人、矿山督导、商业教练、艺术教师、销售员、业务主管等等"],
    "EAI":["适合的专业有：管理科学与工程类、新闻学、动画、播音与主持艺术、广告学、传播学、审计学、艺术教育、艺术学、市场营销",
        "适合的职业有：系主任、部门主管、记者、动漫工程师、播音与主持、媒体策划师、艺术制作人、审计师、培训师、艺术教师、销售员、业务主管、经理人等等"],
    "ECA":["适合的专业有：经济学类、金融学类、审计学、会计学、管理科学与工程类、新闻学、广告学、传播学、公共管理类、市场营销",
        "适合的职业有：会计、审计师、部门主管、记者、媒体策划师、公共关系人员、商学教师/培训师、销售员、业务主管、经理人等等"],
    "ECR":["适合的专业有：经济学类、金融学类、审计学、会计学、管理科学与工程类、公共管理类、市场营销、法学",
        "适合的职业有：会计、审计师、部门主管、商学教师/培训师、销售员、业务主管、经理人、项目经理、律师等等"],
    "EIA":["适合的专业有：审计学、新闻学、广告学、传播学、公共关系学、市场营销、工业工程类、保险学、财务管理",
        "适合的职业有：审计师、传媒顾问、公关人员、工业工程师、市政工程师、保险业务员、理财顾问、拍卖师等"],
    "IAC":["适合的专业有：中国语言文学类、外国语言文学类、工业工程类、园艺、园林、经济学类、金融学类、考古学、文物与博物馆学、文物保护技术",
        "适合的职业有：语言教师、工业工程师、园艺师、经济师、考古工作者、博物馆员、文物收藏家、文物鉴定师等"],
    "IAE":["适合的专业有：中国语言文学类、外国语言文学类、工业工程类、园艺、园林、经济学类、金融学类、考古学、文物与博物馆学、文物保护技术、法学、心理学类",
        "适合的职业有：语言教师、工业工程师、园艺师、经济师、考古工作者、博物馆员、文物收藏家、律师、心理学家等"],
    "ICA":["适合的专业有：中国语言文学类、外国语言文学类、考古学、文物与博物馆学、社会学类、数学类、测绘类、统计学类、包装工程",
        "适合的职业有：语言学家、语言教师、考古学工作者、人类学家、数学家、测绘工程师、制图员、统计员、包装师等"],
    "ICE":["适合的专业有：中国语言文学类、外国语言文学类、社会学类、审计学、包装工程、工业工程类、图书情报与档案管理类、计算机科学与技术、软件工程、侦查学等",
        "适合的职业有：语言学家、语言教师、人类学家、审计师、包装师、项目经理、图书馆员、网络/数据库工程师、侦探等"],
    "ICS":["适合的专业有：历史学、人文教育、经济学类、金融学类、财务管理、会计学、安全工程、统计学类、中国语言文学类、外国语言文学类、药学类、中药学类、自动化类、软件工程、网络工程、包装工程",
        "适合的职业有：史学家、历史教师、财务会计、安全员、统计师、教育顾问、语言学家、语言教师、秘书、行政主管、药剂师、自动化工程师、软件工程师、网络工程师、包装设计师、免疫医师等"],
    "IEA":["适合的专业有：建筑类、水利水电工程、经济学类、金融学类、工业工程类、软件工程、管理科学与工程类、药学类、中药学类、机械工程、园艺、园林、测绘类",
        "适合的职业有：建筑师、水利工程师、经济师、工业工程师、经济/金融分析师、软件工程师、管理工程师、项目经理、药剂师、实验室主管、质检工程师/主管、医疗器械工程师、园艺顾问、测绘工程师、制图员等"],
    "IER":["适合的专业有：水利水电工程、农田水利工程、工业工程类、软件工程、网络工程、管理科学与工程类、统计学类、经济统计学、审计学、心理学类、地质学、环境科学与工程类、安全工程、大气科学类、信息与计算科学、信息工程、信息安全、信息对抗技术、信息管理与信息系统、信息资源管理、机械类、药学类、中药学类、农业机械化及其自动化",
        "适合的职业有：水利工程师、工业工程师、网络工程师、管理分析师、数据分析师、审计师、工业心理学家、农业工程师、地质工程师、环境工程师、安全员、学校心理师、气象员、实验管理员、领航员、土壤学家、系统工程师、影视技师、仓储工程师、工业治疗师、信息工程师、机械师、药剂师、农业机械师、侦查员、科技作家、软件工程主管、设备工程师、海军军官、工业工程教师、现场工程师等"],
    "RAC":["适合的专业有：园艺、园林、机械工程类、服装设计与工程、服装与服饰设计、工业设计、工艺美术、舞蹈表演、舞蹈编导、运动训练、测绘类、宝石及材料工艺学",
        "适合的职业有：手工艺人、工业技师、园艺师、机械师、裁缝、工艺品工程师、舞蹈家、健身教练、制图员、测绘师、篆刻家、珠宝加工技师等等"],
    "RAE":["适合的专业有：建筑类、园艺、园林、雕塑、舞蹈表演、舞蹈编导、工艺美术、工业设计、体育学类、服装设计与工程、服装与服饰设计、食品科学与工程类",
        "适合的职业有：建筑师、园艺师、雕刻家、舞蹈家、工艺品工程师、健身教练、体育教师、裁缝、乐器技师、模具师、点心师等"],
    "RAS":["适合的专业有：建筑类、园艺、园林、舞蹈表演、舞蹈编导、工艺美术、工业设计、体育学类、服装设计与工程、服装与服饰设计、食品科学与工程类",
        "适合的职业有：建筑师、园艺师、舞蹈家、工艺品工程师、健身教练、体育教师、裁缝、乐器技师、点心师等"],
    "RCA":["适合的专业有：测绘工程、雕塑、工艺美术、工业设计、轻工类、木材科学与工程",
        "适合的职业有：手工艺人、磨具师、制图员、测绘师、雕刻家、工艺品制作工、印刷工、包装工、装订工、刺绣工、陶瓷工、木工、刻字工、钟表工等等"],
    "REA":["适合的专业有：物业管理、体育学类、舞蹈表演、舞蹈编导 公安学类、交通管理、机械类、建筑类、植物生产类、园艺、园林、印刷工程、焊接技术与工程",
        "适合的职业有：领航员、仓储工程师、物业管理员、体育教师/教练、舞蹈演员、交警、项目经理、现场工程师、机械师、建筑师、农业技术员、园艺师、景观设计师、玻璃工、油漆工、雕刻工、印刷工、电焊工等等"],
    "RSA":["这种性格的人比较少,但可以参考实物型和社会型两大类的专业与职业。比如相关的专业有体育学类、舞蹈表演、舞蹈学、舞蹈编导、人文地理与城乡规划、城乡规划、宝石及材料工艺学、材料成型及控制工程、工业设计、土地资源管理、表演",
        "相关的职业有公交车驾驶员、体育健身教师/教练、舞蹈演员、室内设计师、市政规划师、银匠、手工艺人、杂技演员、民间艺人、曲艺演员、化妆师、模具师等"],
    "RSC":["工业工程类、物业管理、物流管理与工程类、交通运输、交通设备与控制工程、交通管理工程、交通管理、机械类、印刷工程、电气类、木材科学与工程、宝石及材料工艺学",
        "适合的职业有：工业工程师、物业管理员、物流工程师、领航员、交通管理员/交警、调度员、机械师、工厂领班、流水线操作工、印刷工、电工、家电修理工、木工、玻璃工、成型工、质检员、建筑工、雕刻工、钳工、装配工、烟草工、面包师、银匠等等"],
    "SAC":["专门对应于适合这种性格的专业与职业比较少,但可以参考社会型和艺术型两大类的专业与职业。如相关的专业有外国语言文学类、中国语言文学类、学前教育、艺术教育、心理学类、社会学类等",
        "相关的职业有翻译、外语教师、艺术教师、中文教师、心理咨询师、工业心理治疗师、社会工作师等"],
    "SAI":["适合专业有：学前教育、科学教育、化学类、中国语言文学类、哲学类、心理学类、护理学类、特殊教育、社会学类、图书情报与档案管理类、口腔医学、口腔医学技术、听力与言语康复学",
        "适合的职业有：幼儿教师、化学教师、中文教师、哲学家、牧师、心理咨询师、护士、特殊儿童教师、社会工作者、语言矫正医师、图书馆员、牙科医师等"],
    "SAR":["专门对应于适合这种性格的专业与职业比较少,但可以参考社会型和艺术型两大类的专业与职业。如相关的专业有艺术教育、心理学类、社会学类等",
        "相关的职业有理疗师、艺术教师、手工艺人、心理咨询师、矫正治疗师、社会工作师等"],
    "SCA":["适合的专业有：中国语言文学类、外国语言文学类、公安学类、公安技术类、社会学类、心理学类、特殊教育、护理类、旅游管理类、保险学、新闻学",
        "适合的职业有：汉语教师、外语教师、警察、社工师、心理咨询师、特殊儿童教师、护士、导游、保险业务员、记者、制图员等"],
    "SCI":["中国语言文学类、外国语言文学类、公安学类、公安技术类、社会学类、心理学类、基础医学、临床医学、中西医临床医学、特殊教育、护理类、旅游管理类、保险学",
        "适合的职业有：汉语教师、外语教师、警察、社工师、心理咨询师、理疗师、职业病治疗师、特殊儿童教师、护士、饭店业务员、保险业务员等"],
    "SCR":["适合的专业有：动物医学类、体育学类、化学类、科学教育、公安学类、社会学类、心理学类、临床医学、中西医临床医学、特殊教育、护理学类、酒店管理、保险学、质量管理工程",
        "适合的职业有：兽医、体育教师、健身教练、化学教师、实验室管理员、特警、社工师、心理咨询师、理疗师、职业病治疗师、特殊儿童教师、护士、饭店业务员、保险业务员、质检员、医疗技师、厨师等"],
    "SRA":["适合的专业有：广播电视编导、人文地理与城乡规划、城乡规划、农村区域发展、土地资源管理、体育学类、动物医学类、动物生产类、基础医学、临床医学、中西医临床医学、护理学类、医学技术类、园艺、园林、酒店管理、市场营销",
        "适合的职业有：影视编导、城市规划师、体育教师、健身教练、兽医师、驯兽师、牙医师、家庭医生、邮递员、护士、医疗器械工程师、园艺师、饭店业务员等"],
};

// 主要有语言智能、、空间智能、身体运动智能、、、自我认知智能、自然认知智能。
// "R":["现实型(实际型)"
//     "I":["研究型"数学逻辑智能
//     "A":["艺术型"音乐智能
//     "S":["社会型" 人际智能
//     "E":["企业型(管理型)"
//     "C":["常规型(传统型、事务型)"