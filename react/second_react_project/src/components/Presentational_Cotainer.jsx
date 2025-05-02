const Container=()=>{
    let data="hello world logic in container  component"
    return (
    <>
     <Presentation data={data}/>
    
    </>
    );
};

const Presentation=({ data})=>{
    return ( 
    <>
    <div> {data} in Presentation</div>
    <div>Presentation component</div>
    </>
    );
};

export default Container;