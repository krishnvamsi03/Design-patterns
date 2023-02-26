from NewsAgency import NewsAgency
from NewsChannel import NewsChannel

if __name__ == "__main__":
    news_agency = NewsAgency()
    for i in range(10):
        news_agency.add_channels(NewsChannel(i))

    news_agency.notify_channels("Hello world")
    news_agency.notify_channels("new news")
