package guanchazhemoshi;



//看NBA的同事
class NBAObserver
{
  private String name;
  private Subject sub;
  public NBAObserver(String name, Subject sub)
  {
      this.name = name;
      this.sub = sub;
  }

  //关闭NBA直播
  public void CloseNBADirectSeeding()
  {
      Console.WriteLine("{0} {1} 关闭NBA直播，继续工作！", sub.SubjectState, name);
  }
}