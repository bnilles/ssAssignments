import pandas as pd


df = pd.read_csv('C:\\Users\\bnilles\\Desktop\\ClassNotesPython\\salaries.csv')

print(df.head())

print(df.info())
print(df['BasePay'].head(1000).mean())
print(df['TotalPayBenefits'].max())
print(df.loc[df['EmployeeName'] == 'JOSEPH DRISCOLL']['JobTitle'])
print(df.loc[df['EmployeeName'] == 'JOSEPH DRISCOLL']['TotalPayBenefits'])
print(df.loc[df['TotalPayBenefits'].argmax()]['EmployeeName'])
print(df.loc[df['TotalPayBenefits'].argmin()]['EmployeeName'])
print(df.groupby('Year')['TotalPay'].mean())
print(df['JobTitle'].nunique())
print(df.groupby('JobTitle').count())