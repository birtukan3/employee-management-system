USE [javafx]
GO
/****** Object:  Table [dbo].[departments]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[departments](
	[dept_id] [int] IDENTITY(1,1) NOT NULL,
	[dept_name] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[dept_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[dept_name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee_details]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee_details](
	[EmployeeID] [varchar](20) NOT NULL,
	[FName] [varchar](50) NOT NULL,
	[LName] [varchar](50) NOT NULL,
	[Gender] [varchar](10) NOT NULL,
	[DOB] [date] NOT NULL,
	[Email] [varchar](100) NOT NULL,
	[Address] [nvarchar](255) NOT NULL,
	[pincode] [varchar](10) NULL,
	[BloodGroup] [varchar](5) NULL,
	[EmployeeLevel] [varchar](50) NULL,
	[dept_id] [int] NULL,
	[DOJ] [date] NOT NULL,
	[project_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee_login]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee_login](
	[Eid] [varchar](20) NOT NULL,
	[username] [varchar](24) NOT NULL,
	[password] [varchar](34) NOT NULL,
	[email] [varchar](29) NULL,
PRIMARY KEY CLUSTERED 
(
	[Eid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee_performance]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee_performance](
	[Performance_id] [int] NOT NULL,
	[Eid] [varchar](20) NOT NULL,
	[SinceritySelf] [int] NULL,
	[ReliabilitySelf] [int] NULL,
	[LeadSelf] [int] NULL,
	[TeamSelf] [int] NULL,
	[IntegritySelf] [int] NULL,
	[SoftSkillsSelf] [int] NULL,
	[CommentsSelf] [varchar](100) NULL,
	[SincerityHR] [int] NULL,
	[ReliabilityHR] [int] NULL,
	[LeadHR] [int] NULL,
	[TeamHR] [int] NULL,
	[IntegrityHR] [int] NULL,
	[SoftSkillsHR] [int] NULL,
	[CommentsHR] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[Performance_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee_phones]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee_phones](
	[phone_id] [int] IDENTITY(1,1) NOT NULL,
	[employee_id] [varchar](20) NOT NULL,
	[phone_number] [varchar](15) NOT NULL,
	[EmergencyContactNumber] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[phone_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[grievancestable]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[grievancestable](
	[GRIEVEID] [int] IDENTITY(1,1) NOT NULL,
	[EmployeeID] [varchar](20) NOT NULL,
	[GTEXT] [nvarchar](max) NULL,
	[GStatus] [nvarchar](38) NULL,
	[processed_by] [varchar](20) NULL,
	[submission_date] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[GRIEVEID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hr_login]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hr_login](
	[Eid] [varchar](20) NOT NULL,
	[hr_username] [varchar](24) NOT NULL,
	[hr_password] [varchar](34) NOT NULL,
	[hr_email] [varchar](29) NULL,
PRIMARY KEY CLUSTERED 
(
	[Eid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[leave_applications]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[leave_applications](
	[LeaveID] [int] IDENTITY(1,1) NOT NULL,
	[employee_id] [varchar](20) NOT NULL,
	[LStartDate] [date] NOT NULL,
	[LEndDate] [date] NOT NULL,
	[Reason] [nvarchar](max) NULL,
	[LStatus] [nvarchar](50) NOT NULL,
	[processed_by] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[LeaveID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[locations]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[locations](
	[pincode] [varchar](10) NOT NULL,
	[city] [varchar](50) NOT NULL,
	[state] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[pincode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[payroll]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[payroll](
	[EID] [varchar](20) NOT NULL,
	[Month] [varchar](20) NOT NULL,
	[BasePay] [decimal](18, 2) NOT NULL,
	[Bonus] [decimal](18, 2) NOT NULL,
	[RMB] [decimal](18, 2) NOT NULL,
	[Deduction] [decimal](18, 2) NOT NULL,
	[TaxDeduction] [decimal](18, 2) NOT NULL,
	[NetPayment] [decimal](18, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[EID] ASC,
	[Month] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[projects]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[projects](
	[project_id] [int] IDENTITY(1,1) NOT NULL,
	[project_name] [varchar](100) NOT NULL,
	[description] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[project_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[reimbursements]    Script Date: 6/3/2025 3:14:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[reimbursements](
	[RID] [int] IDENTITY(1,1) NOT NULL,
	[employee_id] [varchar](20) NOT NULL,
	[RDOS] [date] NOT NULL,
	[Ramount] [decimal](10, 2) NOT NULL,
	[Reason] [nvarchar](max) NULL,
	[Rstatus] [nvarchar](50) NOT NULL,
	[processed_by] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[RID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[grievancestable] ADD  DEFAULT (getdate()) FOR [submission_date]
GO
ALTER TABLE [dbo].[employee_details]  WITH CHECK ADD FOREIGN KEY([dept_id])
REFERENCES [dbo].[departments] ([dept_id])
GO
ALTER TABLE [dbo].[employee_details]  WITH CHECK ADD FOREIGN KEY([pincode])
REFERENCES [dbo].[locations] ([pincode])
GO
ALTER TABLE [dbo].[employee_details]  WITH CHECK ADD FOREIGN KEY([project_id])
REFERENCES [dbo].[projects] ([project_id])
GO
ALTER TABLE [dbo].[Employee_login]  WITH CHECK ADD FOREIGN KEY([Eid])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[employee_performance]  WITH CHECK ADD FOREIGN KEY([Eid])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[employee_phones]  WITH CHECK ADD FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[grievancestable]  WITH CHECK ADD FOREIGN KEY([EmployeeID])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[hr_login]  WITH CHECK ADD FOREIGN KEY([Eid])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[leave_applications]  WITH CHECK ADD FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[payroll]  WITH CHECK ADD FOREIGN KEY([EID])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
ALTER TABLE [dbo].[reimbursements]  WITH CHECK ADD FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee_details] ([EmployeeID])
GO
