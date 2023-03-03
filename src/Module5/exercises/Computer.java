package Module5.exercises;

public class Computer {
    private String processor, graphiCard, motherBoardModel;
    private int price;

    public Computer(String processor, String graphiCard, String motherBoardModel, int price) {
        this.processor = processor;
        this.graphiCard = graphiCard;
        this.motherBoardModel = motherBoardModel;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getGraphiCard() {
        return graphiCard;
    }

    public void setGraphiCard(String graphiCard) {
        this.graphiCard = graphiCard;
    }

    public String getMotherBoardModel() {
        return motherBoardModel;
    }

    public void setMotherBoardModel(String motherBoardModel) {
        this.motherBoardModel = motherBoardModel;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
