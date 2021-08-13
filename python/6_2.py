import openpyxl as xl
import pandas as pd
import datetime


wb = xl.load_workbook('C:\\Users\\bnilles\\Desktop\\ClassNotesPython\\expedia_report_monthly_january_2018.xlsx')
#print( wb.sheetnames)
summary_Sheet = wb['Summary Rolling MoM']
#print(sheet_ranges)
year = 2018
month = 1
for row in summary_Sheet:
  if(type(row[0].value) is  datetime.datetime)  :
    d1 = (row[0].value)
    d2 = datetime.date(year,month,1)

    if(d1.month == d2.month and d1.year == d2.year) :
      print(row[0].value)
  
  # current_row = []
  # for cell in row:
  #   current_row.append(cell.value)
#x  = pd.DataFrame(summary_Sheet)
#print(x.sample(3))

