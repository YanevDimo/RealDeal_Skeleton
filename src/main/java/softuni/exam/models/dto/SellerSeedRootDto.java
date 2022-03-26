package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "sellers")
@XmlAccessorType(XmlAccessType.FIELD)
public class SellerSeedRootDto {

    private List<SellerSeedDto> seller;

    public List<SellerSeedDto> getSeller() {
        return seller;
    }

    public void setSeller(List<SellerSeedDto> seller) {
        this.seller = seller;
    }
}
