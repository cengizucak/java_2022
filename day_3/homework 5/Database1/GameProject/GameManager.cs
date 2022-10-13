using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameProject
{

    //microservice
    class GameManager : IGameService
    {
        public void Add(Gamer gamer)
        {
            Console.WriteLine("Kayit oldu");
            throw new NotImplementedException();
        }
        public void Delete(Gamer gamer)
        {
            Console.WriteLine("Silindi");
            throw new NotImplementedException();
        }
        public void Update(Gamer gamer)
        {
            Console.WriteLine("Guncellendi");
            throw new NotImplementedException();
        }
    }
}
